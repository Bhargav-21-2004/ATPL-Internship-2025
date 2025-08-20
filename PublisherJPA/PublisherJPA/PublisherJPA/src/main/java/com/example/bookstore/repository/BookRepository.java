package com.example.bookstore.repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
	
	
	@Query("SELECT b FROM Book b WHERE b.authorName = : authorName")
	List<Book>  findBooksByAuthorName(@Param("authorName") String authorName);
	
	@Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', :keyword, '%'))")
	List<Book> searchBooksByTitleContaining(@Param("keyword") String keyword);
	
	
	Page<Book> findByGenre(String genre, PageRequest pageRequest);
	List<Book> findAllByOrderByTitleAsc();
    List<Book> findAllByOrderByTitleDesc();

	List<Book> findBooksByTitleContaining(String title);






}
