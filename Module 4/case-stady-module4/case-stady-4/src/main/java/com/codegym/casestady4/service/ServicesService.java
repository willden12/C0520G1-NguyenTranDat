package com.codegym.casestady4.service;

import com.codegym.casestady4.model.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServicesService {
    Page<Services> findAll(Pageable pageable);

    Page<Services> findByIdAndName(String input, Pageable pageable);

    Iterable<Services> findAll();

    Services findById(String id);

    void save(Services services);

    void deleteById(String id);
}
