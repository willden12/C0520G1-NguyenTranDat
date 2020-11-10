package vn.codegym.castady.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.Division;
import vn.codegym.castady.repository.DivisionRepository;
import vn.codegym.castady.service.DivisionService;

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
