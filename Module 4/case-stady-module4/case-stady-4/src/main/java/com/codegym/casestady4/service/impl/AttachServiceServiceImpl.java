package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.AttachService;
import com.codegym.casestady4.repository.AttachServiceRepository;
import com.codegym.casestady4.service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    private AttachServiceRepository attachServiceRepository;

    @Override
    public Iterable<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
