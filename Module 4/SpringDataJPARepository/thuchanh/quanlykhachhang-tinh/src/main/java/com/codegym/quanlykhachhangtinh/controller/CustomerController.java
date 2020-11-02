package com.codegym.quanlykhachhangtinh.controller;


import com.codegym.quanlykhachhangtinh.model.Customer;
import com.codegym.quanlykhachhangtinh.model.Province;
import com.codegym.quanlykhachhangtinh.service.CustomerService;
import com.codegym.quanlykhachhangtinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"","/customers"})
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
        ModelAndView modelAndView = new ModelAndView("customer/list-customer");
        Page<Customer> customerList = customerService.findAll(pageable);
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("customer/create-customer");
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
        ModelAndView modelAndView = new ModelAndView("customer/edit-customer");
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
        ModelAndView modelAndView = new ModelAndView("customer/delete-customer");
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
