package com.company.Impl;

import com.company.Books;
import com.company.Untilty.OptionCreator;
import com.company.Users.Student;

import java.util.Scanner;

public class OptionCreatorImpl implements OptionCreator {
    @Override
    public String CreateOptions() {

        try {

            String iStudent = " Student ";
            String iAdministrator = " Administrator ";
            System.out.println(" Who are you? ");
            System.out.println(" Press 1: " + iStudent.toUpperCase());
            System.out.println(" Press 2:" + iAdministrator.toUpperCase());
            Scanner questions = new Scanner(System.in);
            int answer1 = questions.nextInt();

            if (1 == answer1) {
                System.out.print(" Write your first name: ");
                String writeFirstName = questions.next();
                System.out.print(" Write your last name: ");
                String writeLastName = questions.next();
                StudentCreatorImpl studentCreator = new StudentCreatorImpl();
                Student student = new Student();

                String iGetBook = " get books";
                String iTakeBook = " give books";
                System.out.println(" Chose what you want:");
                System.out.println(" Press 1 if you want to: " + iGetBook.toUpperCase());
                System.out.println(" Press 2 if you want to: " + iTakeBook.toUpperCase());
                int answer2 = questions.nextInt();
                if (1 == answer2){
                    BookCreatorImpl bci = new BookCreatorImpl();
                    Books books = new Books();
                    bci.generateBooks();
                    System.out.println(" Choose what book you want to get: ");
                    System.out.println(" Press number of book witch you want to get: ");
                    int answer4 = questions.nextInt();
                    if (1 == answer4){
                        System.out.println(" Complite! ");
                    }

                }else if (2 == answer2){
                    System.out.println(" jnkj ");
                }
                System.out.println(" Choose what book you want to get: ");
                System.out.println(" Press number of book witch you want to get: ");
                BookCreatorImpl bci = new BookCreatorImpl();
                Books books = new Books();
                bci.generateBooks();

                int answer3 = questions.nextInt();
                if (1 == answer3){
                    System.out.println(" hujbg ");
                }


            }
            if (2 == answer1) {
                System.out.print(" Write your first name: ");
                String adminsFirstName = questions.next();
                System.out.print(" Write your last name: ");
                String adminsLastName = questions.next();

                String getBookList = "  get book list";
                String getStudentList = " get student list";
                System.out.println(" Chose what you want:");
                System.out.println(" Press 1 if you want to: " + getBookList.toUpperCase());
                System.out.println(" Press 2 if you want to: " + getStudentList.toUpperCase());
                int answer4 = questions.nextInt();
                if (1 == answer4){
                    System.out.println(" All books list: ");
                    System.out.println();
                    BookCreatorImpl bci = new BookCreatorImpl();
                    Books books = new Books();
                    bci.generateBooks();
                }
                if (2 == answer4){
                    System.out.println(" All students list: ");
                    StudentCreatorImpl sci = new StudentCreatorImpl();
                    Student student = new Student();
                    sci.generateStudents();
                }
                System.out.println(" What are you want ? ");
                System.out.println(" If you want to exit press 0 ");
                System.out.println(" If you want watch what books have students press 1");


            }

        } catch (Exception e) {
            System.out.println(" Sorry, we have a problem! ");
        }
        return CreateOptions();
    }
}
