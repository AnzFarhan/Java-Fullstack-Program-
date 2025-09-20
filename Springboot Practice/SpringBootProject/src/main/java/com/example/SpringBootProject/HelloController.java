package com.example.SpringBootProject;

import org.springframework.web.bind.annotation.*;

@RestController // marks this class as a RESTful controller
@RequestMapping("/api")//base url for users input/ for all endpoints in this class
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, world";
    }

    //Passing the Request Parameters to RESTful Endpoint / or from users input the URL
    @GetMapping("hello/name") //URL path: /api/hello/name
    public String greetUser(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    //Passing the Request Parameters to RESTful Endpoint / or from users input the URL
    @GetMapping("/search") // URL path: /api/search
    public String search(@RequestParam String keyword) {//GET /api/search?keyword=spring
        return "Searching for: " + keyword;
    }
}
