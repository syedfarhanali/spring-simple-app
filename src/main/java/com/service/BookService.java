package com.service;

import com.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 * Created by farhans on 5/30/18.
 */

@Service
public class BookService {

    private List<Book> books = new ArrayList<>( Arrays.asList(new Book(1,"Harry Potter","JK rowling"),new Book(2,"Inferno","Dan brown")));

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(Integer id) {
       System.out.println("test");
       return books.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

    public List<Book> addBook(Book book) {
        books.add(book);
        return books;
    }


}
