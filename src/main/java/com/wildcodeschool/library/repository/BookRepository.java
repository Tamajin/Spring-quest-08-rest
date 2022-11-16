package com.wildcodeschool.library.repository;

import com.wildcodeschool.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findByTitleContainingOrContentContaining(String text, String textAgain);
}
