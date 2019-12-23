package com.company.Impl;

import com.company.Books;
import com.company.Untilty.AdministratorCreator;
import com.company.Users.Student;

import java.util.Scanner;

public class AdministratorCreatorImpl implements AdministratorCreator {
    @Override
    public String generateAdministrator() {
        // block 2

        try {
            Scanner questions = new Scanner(System.in);
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

        } catch (Exception e) {
            System.out.println(" Sorry, we have a problem in block 2! ");
        } return generateAdministrator();
    }
}

