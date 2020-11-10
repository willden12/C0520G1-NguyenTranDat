package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.EducationDegree;
import com.codegym.casestady4.repository.EducationDegreeRepository;
import com.codegym.casestady4.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
