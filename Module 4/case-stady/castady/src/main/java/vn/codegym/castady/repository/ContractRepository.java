package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
