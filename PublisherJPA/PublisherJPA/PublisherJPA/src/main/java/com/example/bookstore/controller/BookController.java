package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/{authorId}")
    public Book createBook(@PathVariable Long authorId, @RequestBody Book book) {
        return bookService.createBookAndAssignAuthor(book, authorId);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookService.updateBook(id, updatedBook.getTitle());
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/genre/{genre}")
    public Page<Book> getBooksByGenre(@PathVariable String genre,
                                      @RequestParam(defaultValue = "0") int page) {
        return bookService.getBooksByGenre(genre, page);
    }

    @GetMapping("/sorted/asc")
    public List<Book> getBooksSortedAsc() {
        return bookService.getBooksSortedByTitleAsc();
    }

    @GetMapping("/sorted/desc")
    public List<Book> getBooksSortedDesc() {
        return bookService.getBooksSortedByTitleDesc();
    }

    @GetMapping("/author/{name}")
    public List<Book> getBooksByAuthorName(@PathVariable String name) {
        return bookService.getBooksByAuthorName(name);
    }

    @GetMapping("/titleContains/{text}")
    public List<Book> getBooksByTitleContaining(@PathVariable String text) {
        return bookService.getBooksByTitleContaining(text);
    }
}
