package org.example.bookstoreapplication.controller;

import org.example.bookstoreapplication.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookService bookService;
    private final String welcomeUser;

    public BookController(BookService bookService, String welcomeUser){
        this.bookService = bookService;
        this.welcomeUser = welcomeUser;
    }

    @GetMapping("/welcome")
    public String showWelcome(){
        return welcomeUser;
    }

    @GetMapping()
    public String listBooks(){
        return bookService.fetchAllBooks();
    }

    @PostMapping("/order")
    public String orderBook(@RequestParam String bookName){
        return bookService.orderBook(bookName);
    }
}
