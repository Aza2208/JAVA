package com.company.Impl;

import com.company.Books;
import com.company.Untilty.BookCreator;

import java.util.ArrayList;
import java.util.List;

public class BookCreatorImpl implements BookCreator {
    @Override
    public List<Books> generateBooks() {
        Books book1 = new Books();
        book1.setBookName(" 451° по Фаренгейту - ");
        book1.setAuthorName(" Рей Брэдбери ");


        Books book2 = new Books();
        book2.setBookName(" 1984 - ");
        book2.setAuthorName(" Джордж Оруэлл ");

        Books book3 = new Books();
        book3.setBookName(" Шантарам - ");
        book3.setAuthorName(" Грегори Дэвид Робертс ");

        Books book4 = new Books();
        book4.setBookName(" Мастер и Маргарита - ");
        book4.setAuthorName(" Михаил Афанасьевич Булгаков ");

        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);

        for (int i = 1; i < booksList.size(); i++){
            System.out.println(booksList.get(i).getBookName() + booksList.get(i).getAuthorName());
        }
        return booksList;
    }
}
