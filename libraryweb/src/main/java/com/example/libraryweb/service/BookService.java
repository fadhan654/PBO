package com.example.libraryweb.service;

import org.springframework.stereotype.Service;
import com.example.libraryweb.entity.Book;
import com.example.libraryweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}