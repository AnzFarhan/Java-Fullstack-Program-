package com.example.demo.responsitory;

import com.example.demo.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespository extends CrudRepository<Book,Long> {
}
