package com.wildcodeschool.library.controller;


import com.wildcodeschool.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;
}
