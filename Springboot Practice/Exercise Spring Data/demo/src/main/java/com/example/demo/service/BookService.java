package com.example.demo.service;


import com.example.demo.Book;
import com.example.demo.responsitory.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRespository bookRespository;

    public Book createBook(Book book){
        return bookRespository.save(book);
    }

    public Optional<Book> getBookById(Long id){
      return bookRespository.findById(id);
    }

    public Iterable<Book> getAllBook(){
        return bookRespository.findAll();
    }

    public Optional<Book> updateBook(Long id, Book updateBook){
        return bookRespository.findById(id).map(existingBook -> {
            existingBook.setAuthor(updateBook.getAuthor());
            existingBook.setTitle(updateBook.getTitle());
            return existingBook;
        });
    }

    public void deleteBook(Long id){
        bookRespository.deleteById(id);
    }
}
