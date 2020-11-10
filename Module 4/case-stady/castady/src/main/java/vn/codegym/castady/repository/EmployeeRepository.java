package vn.codegym.castady.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Page<Employee> findCustomerByEmployeeIdContainingOrEmployeeNameContaining(String id, String name, Pageable pageable);
}
