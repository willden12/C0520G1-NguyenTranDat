package vn.codegym.castady.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.AttachService;
import vn.codegym.castady.repository.AttachServiceRepository;
import vn.codegym.castady.service.AttachServiceService;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    private AttachServiceRepository attachServiceRepository;

    @Override
    public Iterable<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
