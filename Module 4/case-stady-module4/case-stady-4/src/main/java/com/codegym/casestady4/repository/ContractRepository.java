package com.codegym.casestady4.repository;

import com.codegym.casestady4.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
