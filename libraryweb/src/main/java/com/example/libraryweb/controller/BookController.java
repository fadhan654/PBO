package com.example.libraryweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.libraryweb.entity.Book;
import com.example.libraryweb.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")

public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/dummy")
    public void dummy() {
        Book book = new Book("Algorithm", "examplecom.example, M.kom", "123-5678-9101");
        bookService.save(book);
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public String save(@RequestParam("title") String title, @RequestParam("author") String author,
            @RequestParam("isbn") String isbn) {
        Book book = new Book(title, author, isbn);
        bookService.save(book);
        return "Successfully save books";
    }

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    @ResponseBody
    public String store(@RequestParam("title") String title, @RequestParam("author") String author,
            @RequestParam("isbn") String isbn) {
        Book book = new Book(title, author, isbn);
        bookService.save(book);
        return "Successfully save books with " + title;
    }
}