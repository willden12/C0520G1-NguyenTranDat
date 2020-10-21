package com.codegym.ungdungblog.controller;

import com.codegym.ungdungblog.model.Blog;
import com.codegym.ungdungblog.model.Category;
import com.codegym.ungdungblog.service.BlogService;
import com.codegym.ungdungblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@RequestMapping({"","/blog"})
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> getCategoryList() {
        return categoryService.findAll();
    }

    @GetMapping
    public ModelAndView showList(@PageableDefault(value = 5, sort = {"blogCreateDate", "blogCreateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                                 @RequestParam(value = "inputSearch", defaultValue = "") String inputSearch) {
        ModelAndView modelAndView = new ModelAndView("views/list");
        Page<Blog> blogList;
        if ("".equals(inputSearch)) {
            blogList = blogService.findAll(pageable);
        } else {
            blogList = blogService.findByTitle(inputSearch, pageable);
        }
        modelAndView.addObject("blogList", blogList);
        modelAndView.addObject("inputSearch", inputSearch);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("views/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/save")
    public String createCustomer(Blog blog) {
        blog.setBlogCreateDate(LocalDate.now());
        blog.setBlogCreateTime(LocalTime.now());
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/view/{id}")
    public ModelAndView showView(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("views/view");
        Blog blog = blogService.findById(id);
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }


    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("views/edit");
        Blog blog = blogService.findById(id);
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateCustomer(Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("views/delete");
        Blog blog = blogService.findById(id);
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/confirm")
    public String deleteCustomer(Blog blog) {
        blogService.delete(blog.getBlogId());
        return "redirect:/blog";
    }

//    @GetMapping("/search")
//    public String searchBlog(@RequestParam("search") String search, Model model) {
//        model.addAttribute("blogList", blogService.findByTitle(search));
//        return "views/list";
//    }

    @GetMapping("/{id}")
    public String getBlogCategory(@PathVariable("id") int id, Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("blogList", blogService.findByCategory(category));
        return "views/list";
    }
}
