package com.codegym.casestady4.service;

import com.codegym.casestady4.model.Contract;
import com.codegym.casestady4.model.ContractDetail;

public interface ContractDetailService {
    Iterable<ContractDetail> findAll();

    ContractDetail findById(long id);

    void save(ContractDetail contractDetail);

    void deleteById(long id);

    Iterable<ContractDetail> findContractDetailByContract(Contract contract);
}
