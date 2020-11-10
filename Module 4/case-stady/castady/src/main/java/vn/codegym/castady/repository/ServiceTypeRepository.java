package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.ServiceType;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Long> {
}
