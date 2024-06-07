package com.example.service;

import com.example.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(int id);
    // Outras operações CRUD podem ser adicionadas aqui, se necessário
}
