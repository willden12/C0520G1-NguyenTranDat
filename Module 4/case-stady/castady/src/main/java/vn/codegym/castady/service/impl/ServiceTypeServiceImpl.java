package vn.codegym.castady.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.ServiceType;
import vn.codegym.castady.repository.ServiceTypeRepository;
import vn.codegym.castady.service.ServiceTypeService;

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
