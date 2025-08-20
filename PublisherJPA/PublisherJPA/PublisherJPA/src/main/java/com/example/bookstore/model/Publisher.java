package com.example.bookstore.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="publisher_s")
public class Publisher {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    public Long getId() {
		return id;
	}

	 public void setId(Long id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getLocation() {
		 return location;
	 }

	 public void setLocation(String location) {
		 this.location = location;
	 }

	 public List<Book> getBooks() {
		 return books;
	 }

	 public void setBooks(List<Book> books) {
		 this.books = books;
	 }

		private String name;
	    private String location;

	    @ManyToMany(mappedBy = "publishers")
	    private List<Book> books;

}
