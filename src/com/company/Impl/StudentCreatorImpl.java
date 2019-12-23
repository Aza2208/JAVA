package com.company.Impl;

import com.company.Untilty.StudentCreator;
import com.company.Users.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCreatorImpl implements StudentCreator {
    @Override
    public List<Student> generateStudents() {
        Student student1 = new Student();
        student1.setFirstName(" Azat ");
        student1.setLastName(" Nuraliev ");
        student1.setPhoneNumber(" 0999153163 " + "\n");

        Student student2 = new Student();
        student2.setFirstName(" Bekzat ");
        student2.setLastName(" Mamyraliev ");
        student2.setPhoneNumber(" 0222818468 " + "\n");

        Student student3 = new Student();
        student3.setFirstName(" Edil ");
        student3.setLastName(" Baibolov ");
        student3.setPhoneNumber(" 0707124467 " + "\n");

        Student student4 = new Student();
        student4.setFirstName(" Rashid ");
        student4.setLastName(" Vasilyev ");
        student4.setPhoneNumber(" 0771001352 ");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for (Student student : studentList) {
            System.out.println(" First name: " + student.getFirstName() + "\n"
                    + " Last name: " + student.getLastName() + "\n"
                    + " Phone number: " + student.getPhoneNumber());
        }
        return studentList;
    }

    @Override
    public String OptionsForStudents() {
        // block 1
        try {
            Scanner questions = new Scanner(System.in);
            System.out.print(" Write your first name: ");
            String writeFirstName = questions.next();
            System.out.print(" Write your last name: ");
            String writeLastName = questions.next();
            Student student = new Student();
            if (writeFirstName.equals(student.getFirstName())  && writeLastName.equals(student.getLastName())) {
                String iGetBook = " get books";
                String iTakeBook = " give books";
                System.out.println(" Chose what you want:");
                System.out.println(" Press 1 if you want to: " + iGetBook.toUpperCase());
                System.out.println(" Press 2 if you want to: " + iTakeBook.toUpperCase());
                int answer2 = questions.nextInt();
                if (1 == answer2) {
                    BookCreatorImpl bci = new BookCreatorImpl();
                    bci.generateBooks();
                    System.out.println(" Choose what book you want to get: ");
                    System.out.println(" Press number of book witch you want to get: ");
                    int answer4 = questions.nextInt();
                    if (1 == answer4) {
                        System.out.println(" Complete! ");
                    }

                } else if (2 == answer2) {
                    System.out.println(" jnkj ");
                }
                System.out.println(" Choose what book you want to get: ");
                System.out.println(" Press number of book witch you want to get: ");
                BookCreatorImpl bci = new BookCreatorImpl();
                bci.generateBooks();

                int answer3 = questions.nextInt();
                if (1 == answer3) {
                    System.out.println(" hujbg ");
                }

            } else {
                System.out.println(" Sorry, you aren't our student! ".toUpperCase());
            }
        } catch (Exception e) {
            System.out.println(" Sorry, we have a problem in block 1! ");

        } return OptionsForStudents();
    }
}
