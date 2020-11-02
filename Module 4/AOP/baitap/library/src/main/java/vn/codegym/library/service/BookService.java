package vn.codegym.library.service;


import vn.codegym.library.model.Book;

public interface BookService {
    Iterable<Book> findAll();

    Book findById(int id);

    void save(Book book);

    void  delete(int id);
}
