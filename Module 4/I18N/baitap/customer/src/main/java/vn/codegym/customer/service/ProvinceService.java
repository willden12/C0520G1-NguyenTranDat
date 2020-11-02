package vn.codegym.customer.service;

import vn.codegym.customer.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findOne(int id);

    void save(Province province);

    void remove(int id);
}
