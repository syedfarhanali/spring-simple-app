package com.controller;

import com.entities.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by farhans on 5/30/18.
 */
@RestController

public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @RequestMapping("/book/{id}")
    public Book getBookById(@PathVariable("id") Integer id){
        return bookService.getBook(id);
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public List<Book> addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }


}
