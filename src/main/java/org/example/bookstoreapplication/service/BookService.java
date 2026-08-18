package org.example.bookstoreapplication.service;

import org.example.bookstoreapplication.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final EmailService emailService;

    public BookService(BookRepository bookRepository, EmailService emailService){
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }

    public String fetchAllBooks(){
        return bookRepository.findAllBooks();
    }

    public String orderBook(String bookName){
        bookRepository.saveOrder(bookName);
        emailService.sendEmail(bookName);
        return "Order Placed for Book " + bookName;
    }


}
