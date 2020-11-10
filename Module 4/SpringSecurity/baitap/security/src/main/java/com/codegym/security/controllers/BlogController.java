package com.codegym.security.controllers;

import com.codegym.security.model.Blog;
import com.codegym.security.service.BlogService;
import com.codegym.security.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;


    @GetMapping({"","/blog"})
    public ModelAndView listBlogs(@PageableDefault(value = 5) Pageable pageable, @RequestParam(value = "search",defaultValue = "")String search, @RequestParam(value = "searchCategogy",defaultValue = "all")String searchCategogy){
        Page<Blog> blog = null;
        if ((search.equals("")) && searchCategogy.equals("all") ) {
            blog = blogService.findAll(pageable);
        } else if(!search.equals("") && searchCategogy.equals("all")) {
            blog = blogService.findAllByNameContaining(search,pageable);
        }else if (search.equals("") && !searchCategogy.equals("all")) {
            blog = blogService.findAllByCategory_Name(searchCategogy,pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("category", categoryService.findAll(pageable));
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("search", search);
        modelAndView.addObject("searchCategory", searchCategogy);
        return modelAndView;
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView viewBlogs(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if(blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/view");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/blog/user/error.404");
            return modelAndView;
        }
    }


    @GetMapping("/create-blog")
    public ModelAndView showCreateForm(@PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/blog/user/create","blog",new Blog());
        modelAndView.addObject("category", categoryService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveCustomer(@ModelAttribute("blog") Blog blog, @PageableDefault(value = 5) Pageable pageable) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/user/create");
        modelAndView.addObject("category", categoryService.findAll(pageable));
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if(blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/user/edit");
            modelAndView.addObject("category", categoryService.findAll(Pageable.unpaged()));
            modelAndView.addObject("blog", blog);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/blog/user/error.404");
            return modelAndView;
        }
    }

    @GetMapping("/403")
    public String go403() {
        return "/blog/user/error.404";
    }
    @PostMapping("/edit-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/user/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }


    @GetMapping("/delete-blog/{id}")
    public String deleteBlog(@PathVariable Long id){
        blogService.remove(id);
        return "redirect:/blog";
    }
    @GetMapping("/user")
    public String user(Principal principal) {
        // Get authenticated user name from Principal
        System.out.println(principal.getName());
        return "redirect:/blog";
    }

    @GetMapping("/admin")
    public String admin() {
        // Get authenticated user name from SecurityContext
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println(context.getAuthentication().getName());
        return "redirect:/blog";
    }
}
