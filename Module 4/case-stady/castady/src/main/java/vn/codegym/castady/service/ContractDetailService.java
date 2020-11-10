package vn.codegym.castady.service;


import vn.codegym.castady.model.Contract;
import vn.codegym.castady.model.ContractDetail;

public interface ContractDetailService {
    Iterable<ContractDetail> findAll();

    ContractDetail findById(long id);

    void save(ContractDetail contractDetail);

    void deleteById(long id);

    Iterable<ContractDetail> findContractDetailByContract(Contract contract);
}
