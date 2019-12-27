package com.company.Book.Impl;

import com.company.Book.Book;
import com.company.Book.BookHelper;

import java.util.ArrayList;
import java.util.List;

public class BookHelperImpl implements BookHelper {
    @Override
    public List<Book> generateRandomBooks() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setBookName(" 451° Fahrenheit  ");
        book1.setAuthorName(" Ray Bradbury ");

        Book book2 = new Book();
        book2.setBookName(" 1984  ");
        book2.setAuthorName(" George Orwell ");

        Book book3 = new Book();
        book3.setBookName(" Shantaram  ");
        book3.setAuthorName(" Gregory David Roberts ");

        Book book4 = new Book();
        book4.setBookName(" The Master and Margarita ");
        book4.setAuthorName(" Mikhail Afanasevich Bulgakov ");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        return books;
    }
}
