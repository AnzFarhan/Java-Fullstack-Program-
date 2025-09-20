package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Book {

    private int id;
    private String title;
    private String author;
    private String publishedDate;


    public Book(String publishedDate, String author, String title, int id) {
        this.publishedDate = publishedDate;
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }
}
