package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.CustomerType;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}
