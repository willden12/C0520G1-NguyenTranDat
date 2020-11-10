package com.codegym.casestady4.service;

import com.codegym.casestady4.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    Iterable<Contract> findAll();

    Contract findById(long id);

    void save(Contract contract);

    void deleteById(long id);
}
