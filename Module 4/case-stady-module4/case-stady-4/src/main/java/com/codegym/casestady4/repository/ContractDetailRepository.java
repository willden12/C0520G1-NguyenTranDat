package com.codegym.casestady4.repository;

import com.codegym.casestady4.model.Contract;
import com.codegym.casestady4.model.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDetailRepository extends JpaRepository<ContractDetail, Long> {
    Iterable<ContractDetail> findContractDetailByContract(Contract contract);
}
