package vn.codegym.castady.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.Services;
import vn.codegym.castady.repository.ServiceRepository;
import vn.codegym.castady.service.ServicesService;

@Service
public class ServicesServiceImpl implements ServicesService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Services> findByIdAndName(String input, Pageable pageable) {
        return serviceRepository.findServiceByServiceIdContainingOrServiceNameContaining(input, input, pageable);
    }

    @Override
    public Iterable<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Services findById(String id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Services services) {
        serviceRepository.save(services);
    }

    @Override
    public void deleteById(String id) {
        serviceRepository.deleteById(id);
    }
}
