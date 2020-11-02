package vn.codegym.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.customer.model.Province;

public interface ProvinceRepository extends JpaRepository<Province, Integer>
{
}
