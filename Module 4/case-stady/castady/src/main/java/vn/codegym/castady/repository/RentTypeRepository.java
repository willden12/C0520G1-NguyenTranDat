package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.RentType;

public interface RentTypeRepository extends JpaRepository<RentType, Long> {
}
