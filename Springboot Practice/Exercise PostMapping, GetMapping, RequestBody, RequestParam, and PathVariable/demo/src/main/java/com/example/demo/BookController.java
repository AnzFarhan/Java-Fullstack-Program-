package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {

    List<Book> books = new ArrayList<>();
    AtomicInteger idCounter = new AtomicInteger(1);

//    @PostMapping("/books")
//    public ArrayList<Book> addBook(@RequestBody Book books){
//        books.setId(idCounter.getAndIncrement()); // Set a unique ID
//
//    }

    @PostMapping("/books")
    public ResponseEntity<Map<String, Object>> addBook(@RequestBody Book book) {
        book.setId(idCounter.getAndIncrement()); // Set a unique ID
        books.add(book); // Add the book to the in-memory list

        // Create a response with a confirmation message
        Map<String, Object> response = Map.of(
                "message", "Book added successfully!",
                "book", book
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> retrieveBook(@RequestParam(required = false) String author) {
        List<Book> listBooks;

        //condition for users request by author or not request
        if (author != null && !author.isEmpty()) {
            // Filter books by author
            listBooks = books.stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
        }
        else {
            listBooks = books;
        }

        return ResponseEntity.ok(listBooks);
    }

    @GetMapping("/books/{id}")
    public Book retrieveId(@PathVariable int id){

        //return by id
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book not found with ID: " + id));
    }
}



