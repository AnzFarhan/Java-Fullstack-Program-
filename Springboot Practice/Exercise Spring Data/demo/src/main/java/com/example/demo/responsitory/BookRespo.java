package com.example.demo.responsitory;

import com.example.demo.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookRespo {

    private JdbcTemplate jdbcTemplate;

    public List<Book> retrieveCourse(){
        String sql = "SELECT * FROM Course";

        return jdbcTemplate.
    }
}
