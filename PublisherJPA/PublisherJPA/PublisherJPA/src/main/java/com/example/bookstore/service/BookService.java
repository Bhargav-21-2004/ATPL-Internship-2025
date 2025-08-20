package com.example.bookstore.service;

import com.example.bookstore.model.Author;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.AuthorRepository;
import com.example.bookstore.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Book createBookAndAssignAuthor(Book book, Long authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow();
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Long id, String newTitle) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(newTitle);
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Page<Book> getBooksByGenre(String genre, int page) {
        return bookRepository.findByGenre(genre, PageRequest.of(page, 10));
    }

    public List<Book> getBooksSortedByTitleAsc() {
        return bookRepository.findAllByOrderByTitleAsc();
    }

    public List<Book> getBooksSortedByTitleDesc() {
        return bookRepository.findAllByOrderByTitleDesc();
    }

    public List<Book> getBooksByAuthorName(String authorName) {
        return bookRepository.findBooksByAuthorName(authorName);
    }

    public List<Book> getBooksByTitleContaining(String title) {
        return bookRepository.findBooksByTitleContaining(title);
    }
}
