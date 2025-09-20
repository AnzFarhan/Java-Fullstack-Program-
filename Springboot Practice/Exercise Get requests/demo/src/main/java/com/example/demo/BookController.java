package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class BookController {

    private ArrayList<Books> booksList = new ArrayList<>();

    public BookController(){
        booksList.add(new Books(1,"Hang Tuah", "Farhan",2025));
        booksList.add(new Books(2,"Hayalan", "Farhan",2023));
        booksList.add(new Books(3,"The Great Gatsby", "Farhan",2025));


    }
    @GetMapping("/books")
    public ArrayList<Books> getBooksList(){
        return booksList;
    }

    @GetMapping("/books/id/{id}")
    public Books booksListById(@PathVariable int id){
        System.out.println("Path Variable ID: " + id);
        // Find the book with the matching ID
        return booksList.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book not found with ID: " + id));
    }

    @GetMapping("/books/year/{year}")
    public ArrayList<Books> booksListByYear(@PathVariable int year){
        System.out.println("Path Variable Year: " + year);
        ArrayList<Books> yearBooks = new ArrayList<>();

        for(Books books : booksList){
            if(books.getYear() == year){
                yearBooks.add(books);
            }
            else{
                System.out.println("Not FOund");
            }
        }

        return yearBooks;
    }

    public ArrayList<Books> getBooks() {
        return booksList;

    }

    public void setBooks(ArrayList<Books> books) {
        this.booksList = books;
    }
}
