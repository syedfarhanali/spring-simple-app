package com.entities;

/**
 * Created by farhans on 5/30/18.
 */

public class Book {
    int id;

    String name;

    String author;

    public String getName() {
        return name;
    }

    public Integer getId() {

        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void getName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public Book() {}
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

}
