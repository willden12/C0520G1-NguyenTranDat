package vn.codegym.castady.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.castady.model.Services;

public interface ServicesService {
    Page<Services> findAll(Pageable pageable);

    Page<Services> findByIdAndName(String input, Pageable pageable);

    Iterable<Services> findAll();

    Services findById(String id);

    void save(Services services);

    void deleteById(String id);
}
