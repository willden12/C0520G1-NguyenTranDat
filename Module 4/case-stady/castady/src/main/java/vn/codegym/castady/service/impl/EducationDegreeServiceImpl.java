package vn.codegym.castady.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.EducationDegree;
import vn.codegym.castady.repository.EducationDegreeRepository;
import vn.codegym.castady.service.EducationDegreeService;

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
