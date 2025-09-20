package com.example.demo.controller;

import com.example.demo.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/books")
    public Book createnewBook(@RequestBody Book book){

        return bookService.createBook(book);
    }

    @GetMapping("/books/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @GetMapping("/books")
    public Iterable<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @PutMapping("/books/{id}")
    public Optional<Book> updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBook(id, book);

    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
}
