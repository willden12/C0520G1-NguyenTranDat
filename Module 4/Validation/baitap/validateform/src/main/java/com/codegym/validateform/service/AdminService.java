package com.codegym.validateform.service;

import com.codegym.validateform.model.Admin;


import java.util.List;

public interface AdminService {
    List<Admin> findAll();

    void save(Admin admin);
}
