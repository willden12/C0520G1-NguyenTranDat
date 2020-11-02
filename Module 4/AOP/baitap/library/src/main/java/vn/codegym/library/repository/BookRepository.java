package vn.codegym.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.library.model.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {
}
