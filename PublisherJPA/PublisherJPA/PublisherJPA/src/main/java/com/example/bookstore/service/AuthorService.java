package com.example.bookstore.service;

import com.example.bookstore.model.Author;
import com.example.bookstore.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author updateAuthor(Long id, String name) {
        Author author = authorRepository.findById(id).orElseThrow();
        author.setName(name);
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    public List<Author> getAuthorsStartingWith(String letter) {
        return authorRepository.findByNameStartingWith(letter);
    }

    public List<Author> getAuthorsWithMoreThanXBooks(int count) {
        return authorRepository.findAuthorsWithMoreThanXBooks(count);
    }
}
