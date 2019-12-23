package com.company.Impl;

import com.company.Books;
import com.company.Untilty.BookCreator;

import java.util.ArrayList;
import java.util.List;

public class BookCreatorImpl implements BookCreator {
    @Override
    public List<Books> generateBooks() {
        Books book1 = new Books();
        book1.setBookName(" 451° Fahrenheit - ");
        book1.setAuthorName(" Ray Bradbury ");

        Books book2 = new Books();
        book2.setBookName(" 1984 - ");
        book2.setAuthorName(" George Orwell ");

        Books book3 = new Books();
        book3.setBookName(" Shantaram - ");
        book3.setAuthorName(" Gregory David Roberts ");

        Books book4 = new Books();
        book4.setBookName(" The Master and Margarita - ");
        book4.setAuthorName(" Mikhail Afanasevich Bulgakov ");

        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);

        for (int i = 0; i < booksList.size(); i++){
            System.out.println(booksList.get(i).getBookName() + booksList.get(i).getAuthorName());
        }
        return booksList;
    }
}
