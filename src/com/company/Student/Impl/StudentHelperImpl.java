package com.company.Student.Impl;


import com.company.Book.BookHelper;
import com.company.Book.Book;
import com.company.Book.Impl.BookHelperImpl;
import com.company.Student.Student;
import com.company.Student.StudentHelper;

import java.util.*;


public class StudentHelperImpl implements StudentHelper {
    @Override
    public List<Student> generateStudents() {
        BookHelper bookHelper = new BookHelperImpl();
        List<Book> books = bookHelper.generateRandomBooks();

        Student student1 = new Student();
        student1.setFirstName("Azat");
        student1.setLastName("Nuraliev");
        student1.setPhoneNumber(" 0999153163 ");
        student1.setStudyAdress(" KEU ");
        student1.setGroup(" Business control ");
        student1.setAdress(" Chui region, v.Sokuluk ");

        Student student2 = new Student();
        student2.setFirstName("Bekzat");
        student2.setLastName("Mamyraliev");
        student2.setPhoneNumber(" 0222818468 ");
        student2.setStudyAdress(" KRSU ");
        student2.setGroup(" Economic ");
        student2.setAdress(" Chui region, c.Bishkek ");

        Student student3 = new Student();
        student3.setFirstName("Edil");
        student3.setLastName("Baibolov");
        student3.setPhoneNumber(" 0707124467 ");
        student3.setStudyAdress(" AUCA ");
        student3.setGroup(" IT programmer ");
        student3.setAdress(" Talas region, c.Talas ");

        Student student4 = new Student();
        student4.setFirstName("Rashid");
        student4.setLastName("Vasilyev");
        student4.setPhoneNumber(" 0771001352 ");
        student4.setStudyAdress(" KNU ");
        student4.setGroup(" Bank worker ");
        student4.setAdress(" Chui region, c.Tokmok ");



        return Arrays.asList(student1, student2, student3, student4);
    }
}
