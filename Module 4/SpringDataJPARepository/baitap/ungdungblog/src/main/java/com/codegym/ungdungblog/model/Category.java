package com.codegym.ungdungblog.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "blogCategory", cascade = CascadeType.REMOVE)
    private List<Blog> categoryBlogList;

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Blog> getCategoryBlogList() {
        return categoryBlogList;
    }

    public void setCategoryBlogList(List<Blog> categoryBlogList) {
        this.categoryBlogList = categoryBlogList;
    }
}
