package org.example.bookstoreapplication.service;

import org.example.bookstoreapplication.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public String fetchAllBooks(){
        return bookRepository.findAllBooks();
    }

    public String orderBook(String bookName){
        bookRepository.saveOrder(bookName);
    }
}
