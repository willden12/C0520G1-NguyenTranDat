package com.codegym.casestady4.service;

import com.codegym.casestady4.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByIdAndName(String input, Pageable pageable);

    Iterable<Employee> findAll();

    Employee findById(String id);

    void save(Employee employee);

    void delete(String id);
}
