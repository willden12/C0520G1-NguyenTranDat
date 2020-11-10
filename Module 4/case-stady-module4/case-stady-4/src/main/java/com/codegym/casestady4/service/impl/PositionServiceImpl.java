package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.Position;
import com.codegym.casestady4.repository.PositionRepository;
import com.codegym.casestady4.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
