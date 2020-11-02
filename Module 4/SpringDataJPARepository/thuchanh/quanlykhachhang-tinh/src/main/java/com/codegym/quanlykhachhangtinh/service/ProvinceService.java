package com.codegym.quanlykhachhangtinh.service;


import com.codegym.quanlykhachhangtinh.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findOne(int id);

    void save(Province province);

    void remove(int id);
}
