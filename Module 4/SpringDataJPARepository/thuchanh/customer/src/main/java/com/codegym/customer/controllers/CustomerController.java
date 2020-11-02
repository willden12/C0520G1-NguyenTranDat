package com.codegym.customer.controllers;


import com.codegym.customer.model.Customer;
import com.codegym.customer.model.Province;
import com.codegym.customer.service.CustomerService;
import com.codegym.customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("")
    public ModelAndView showList(@PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        Page<Customer> customerList = customerService.findAll(pageable);
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/save")
    public String createCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("{id}/edit")
    public ModelAndView showEditForm(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("{id}/delete")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("customer/delete");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/confirm")
    public String deleteCustomer(Customer customer) {
        customerService.delete(customer.getId());
        return "redirect:/";
    }
}
