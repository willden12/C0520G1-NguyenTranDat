package com.codegym.casestady4.repository;

import com.codegym.casestady4.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Page<Employee> findCustomerByEmployeeIdContainingOrEmployeeNameContaining(String id, String name, Pageable pageable);
}
