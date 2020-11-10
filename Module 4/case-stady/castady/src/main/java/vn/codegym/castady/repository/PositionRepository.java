package vn.codegym.castady.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
