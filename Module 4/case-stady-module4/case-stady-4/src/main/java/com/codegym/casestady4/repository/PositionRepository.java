package com.codegym.casestady4.repository;

import com.codegym.casestady4.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
