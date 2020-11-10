package com.codegym.casestady4.repository;

import com.codegym.casestady4.model.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Services, String> {
    Page<Services> findServiceByServiceIdContainingOrServiceNameContaining (String id, String name, Pageable pageable);
}
