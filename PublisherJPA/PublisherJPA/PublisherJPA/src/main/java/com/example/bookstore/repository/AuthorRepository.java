package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.bookstore.model.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE a.name LIKE :letter%")
    List<Author> findByNameStartingWith(@Param("letter") String letter);

    @Query("SELECT a FROM Author a WHERE SIZE(a.books) > :count")
    List<Author> findAuthorsWithMoreThanXBooks(@Param("count") int count);
}
