package vn.codegym.library.service;

import vn.codegym.library.model.RandomCode;

public interface RandomCodeService {
    Iterable<RandomCode> findAll();

    RandomCode findById(int id);

    void save(RandomCode code);

    void delete(int id);

    RandomCode findByBookAndCode(int bookId, int code);
}
