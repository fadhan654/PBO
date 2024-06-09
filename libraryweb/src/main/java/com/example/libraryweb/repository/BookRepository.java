package com.example.libraryweb.repository;

import com.example.libraryweb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}