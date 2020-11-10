package com.codegym.casestady4.controllers;

import com.codegym.casestady4.model.Contract;
import com.codegym.casestady4.model.Customer;
import com.codegym.casestady4.model.Employee;
import com.codegym.casestady4.model.Services;
import com.codegym.casestady4.service.ContractService;
import com.codegym.casestady4.service.CustomerService;
import com.codegym.casestady4.service.EmployeeService;
import com.codegym.casestady4.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ServicesService servicesService;

    @ModelAttribute("employeeList")
    public Iterable<Employee> getEmployeeList() {
        return employeeService.findAll();
    }

    @ModelAttribute("customerList")
    public Iterable<Customer> getCustomerList() {
        return customerService.findAll();
    }

    @ModelAttribute("serviceList")
    public Iterable<Services> getServiceList() {
        return servicesService.findAll();
    }

    @GetMapping
    public String getContractList(@PageableDefault(value = 5) Pageable pageable, Model model) {
        model.addAttribute("contractList", contractService.findAll(pageable));
        return "contract/contract-list";
    }

    @GetMapping("/create")
    public ModelAndView showCreateContractForm() {
        ModelAndView modelAndView = new ModelAndView("contract/contract-create");
        modelAndView.addObject("contract", new Contract());
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveNewContract(@Validated Contract contract, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new Contract().validate(contract, bindingResult);
        if (bindingResult.hasErrors()) {
            return "contract/contract-create";
        } else {
            contractService.save(contract);
            redirectAttributes.addFlashAttribute("messInform", "Create Successful!!!");
            return "redirect:/contract";
        }
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showContractInformation(@PathVariable("id") long id) {
        Contract contract = contractService.findById(id);
        ModelAndView modelAndView = new ModelAndView("contract/contract-detail");
        modelAndView.addObject("contract", contract);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditContractForm(@PathVariable("id") long id) {
        Contract contract = contractService.findById(id);
        ModelAndView modelAndView = new ModelAndView("contract/contract-edit");
        modelAndView.addObject("contract", contract);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateContractInformation(@Validated Contract contract, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new Contract().validate(contract, bindingResult);
        if (bindingResult.hasErrors()) {
            return "contract/contract-edit";
        } else {
            contractService.save(contract);
            redirectAttributes.addFlashAttribute("messInform", "Update Successful!!!");
            return "redirect:/contract";
        }
    }

    @GetMapping("delete/{id}")
    public ModelAndView showDeleteContractForm(@PathVariable("id") long id) {
        Contract contract = contractService.findById(id);
        ModelAndView modelAndView = new ModelAndView("contract/contract-delete");
        modelAndView.addObject("contract", contract);
        return modelAndView;
    }

    @PostMapping("/confirm")
    public String deleteContractInformation(Contract contract, RedirectAttributes redirectAttributes) {
        contractService.deleteById(contract.getContractId());
        redirectAttributes.addFlashAttribute("messInform", "Delete Successful!!!");
        return "redirect:/contract";
    }
}
