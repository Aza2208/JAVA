package com.company.Impl;

import com.company.Untilty.StudentCreator;
import com.company.Users.Student;

import java.util.ArrayList;
import java.util.List;

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
}
