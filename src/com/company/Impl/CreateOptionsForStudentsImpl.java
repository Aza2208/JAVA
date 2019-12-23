package com.company.Impl;

import com.company.Books;
import com.company.Untilty.CreateOptionsForStudent;
import com.company.Users.Student;

import java.util.Scanner;

public class CreateOptionsForStudentsImpl implements CreateOptionsForStudent {
    @Override
    public String createOptionsForStudents() {
        // block 1
        try {
            Scanner questions = new Scanner(System.in);
            System.out.print(" Write your first name: ");
            String writeFirstName = questions.next();
            System.out.print(" Write your last name: ");
            String writeLastName = questions.next();
            Student student = new Student();
                if (writeFirstName == student.getFirstName() && writeLastName == student.getLastName()) {
                    String iGetBook = " get books";
                    String iTakeBook = " give books";
                    System.out.println(" Chose what you want:");
                    System.out.println(" Press 1 if you want to: " + iGetBook.toUpperCase());
                    System.out.println(" Press 2 if you want to: " + iTakeBook.toUpperCase());
                    int answer2 = questions.nextInt();
                    if (1 == answer2) {
                        BookCreatorImpl bci = new BookCreatorImpl();
                        Books books = new Books();
                        bci.generateBooks();
                        System.out.println(" Choose what book you want to get: ");
                        System.out.println(" Press number of book witch you want to get: ");
                        int answer4 = questions.nextInt();
                        if (1 == answer4) {
                            System.out.println(" Complite! ");
                        }

                    } else if (2 == answer2) {
                        System.out.println(" jnkj ");
                    }
                    System.out.println(" Choose what book you want to get: ");
                    System.out.println(" Press number of book witch you want to get: ");
                    BookCreatorImpl bci = new BookCreatorImpl();
                    Books books = new Books();
                    bci.generateBooks();

                    int answer3 = questions.nextInt();
                    if (1 == answer3) {
                        System.out.println(" hujbg ");
                    }

            }
        } catch (Exception e) {
            System.out.println(" Sorry, we have a problem in block 1! ");

    } return createOptionsForStudents();
   }
}
