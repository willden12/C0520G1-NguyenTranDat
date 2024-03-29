package com.codegym.validateform.controllers;

import com.codegym.validateform.model.User;
import com.codegym.validateform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
        @Autowired
        UserService userService;

        @GetMapping
        public String showUserList(Model model) {
            model.addAttribute("userList", userService.findAll());
            return "user/user-list";
        }

        @GetMapping("/create")
        public String showCreateForm(Model model) {
            model.addAttribute("user", new User());
            return "user/user-create";
        }

        @PostMapping("/save")
        public String saveUser(@Validated User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
            if (bindingResult.hasErrors()) {
                bindingResult.resolveMessageCodes("typeMismatch.user", "typeMismatch.user.userAge");
                return "user/user-create";
            } else {
                userService.save(user);
                redirectAttributes.addFlashAttribute("mess", "Create Successful!!!");
                return "redirect:";
            }
        }
}
