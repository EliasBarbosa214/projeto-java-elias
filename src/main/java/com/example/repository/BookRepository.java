package com.example.repository;

import com.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    // Outras consultas personalizadas podem ser adicionadas aqui, se necessário
}
