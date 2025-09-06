package com.parcial.uno.parcial_uno.service;

import com.parcial.uno.parcial_uno.dtos.BookDTO;
import com.parcial.uno.parcial_uno.model.Book;

public interface IBookService {
    BookDTO create(Book book);
    BookDTO findById(String id);
    BookDTO findByISBN(String isbn);
    BookDTO update(String id, BookDTO book);
    String delete(String id);
}