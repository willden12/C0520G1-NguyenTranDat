package com.codegym.validateform.service;

import com.codegym.validateform.model.Admin;
import com.codegym.validateform.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements  AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }
}
