package org.example.bookstoreapplication.controller;

import org.example.bookstoreapplication.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
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
