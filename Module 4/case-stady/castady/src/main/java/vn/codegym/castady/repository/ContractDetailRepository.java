package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.Contract;
import vn.codegym.castady.model.ContractDetail;

public interface ContractDetailRepository extends JpaRepository<ContractDetail, Long> {
    Iterable<ContractDetail> findContractDetailByContract(Contract contract);
}
