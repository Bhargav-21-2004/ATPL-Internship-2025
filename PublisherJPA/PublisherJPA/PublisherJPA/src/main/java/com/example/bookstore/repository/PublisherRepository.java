package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {

}
