package com.codegym.quanlykhachhang.controller;

import com.codegym.quanlykhachhang.model.Customer;
import com.codegym.quanlykhachhang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/customer",""})
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
//    @GetMapping(value = "/")
    public String goListCustomer(Model model) {

        model.addAttribute("listCustomer", customerService.findAll());

        return "list_customer";
    }

    @GetMapping("/delete")
    public String goDetailCustomer(@RequestParam Long id, Model model) {
        model.addAttribute("customerDelete", customerService.findById(id));
        return "delete_customer";
    }

    @GetMapping("/delete/")
    public String goDetailCustomerPathVariable(@RequestParam Long id, Model model) {
        model.addAttribute("customerDelete", customerService.findById(id));
        return "delete_customer";
    }

    @GetMapping("/create")
    public String goCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());

        return "create_customer";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Customer student, RedirectAttributes redirectAttributes) {

        this.customerService.save(student);
        redirectAttributes.addFlashAttribute("message", "Create customer NG!");

        return "redirect:/customer";
    }

    @GetMapping("/update")
    public String goUpdateStudent(Model model, @RequestParam Long id) {
        model.addAttribute("customer", this.customerService.findById(id));

        return "update_customer";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Customer customer) {
        this.customerService.save(customer);

        return "redirect:/";
    }
    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam String id){
        this.customerService.remove(Long.valueOf(id));
        return "redirect:/";
    }
}
