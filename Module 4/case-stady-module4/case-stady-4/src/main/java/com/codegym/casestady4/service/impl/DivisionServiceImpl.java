package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.Division;
import com.codegym.casestady4.repository.DivisionRepository;
import com.codegym.casestady4.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
