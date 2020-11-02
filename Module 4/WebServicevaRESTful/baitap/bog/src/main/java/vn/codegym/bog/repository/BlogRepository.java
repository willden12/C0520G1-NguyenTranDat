package vn.codegym.bog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.bog.model.Blog;
import vn.codegym.bog.model.Category;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Iterable<Blog> findBlogByBlogTitleContaining(String name);
    Iterable<Blog> findBlogByBlogCategory(Category category);
}
