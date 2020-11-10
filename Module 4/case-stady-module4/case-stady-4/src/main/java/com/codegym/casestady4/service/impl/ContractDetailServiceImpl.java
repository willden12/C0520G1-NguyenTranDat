package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.Contract;
import com.codegym.casestady4.model.ContractDetail;
import com.codegym.casestady4.repository.ContractDetailRepository;
import com.codegym.casestady4.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    private ContractDetailRepository contractDetailRepository;

    @Override
    public Iterable<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public ContractDetail findById(long id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void deleteById(long id) {
        contractDetailRepository.deleteById(id);
    }

    @Override
    public Iterable<ContractDetail> findContractDetailByContract(Contract contract) {
        return contractDetailRepository.findContractDetailByContract(contract);
    }
}
