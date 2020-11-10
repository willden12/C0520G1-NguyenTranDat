package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.ServiceType;
import com.codegym.casestady4.repository.ServiceTypeRepository;
import com.codegym.casestady4.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
