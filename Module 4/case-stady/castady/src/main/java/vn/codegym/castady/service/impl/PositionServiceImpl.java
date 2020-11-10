package vn.codegym.castady.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.Position;
import vn.codegym.castady.repository.PositionRepository;
import vn.codegym.castady.service.PositionService;

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
