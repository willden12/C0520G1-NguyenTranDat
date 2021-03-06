package vn.codegym.castady.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.castady.model.Contract;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    Iterable<Contract> findAll();

    Contract findById(long id);

    void save(Contract contract);

    void deleteById(long id);
}
