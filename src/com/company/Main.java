package com.company;

import com.company.Impl.AdministratorCreatorImpl;
import com.company.Impl.StudentCreatorImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String iStudent = " Student ";
        String iAdministrator = " Administrator ";
        System.out.println(" Who are you? ");
        System.out.println(" Press 1: " + iStudent.toUpperCase());
        System.out.println(" Press 2:" + iAdministrator.toUpperCase());
        Scanner questions = new Scanner(System.in);
        int answer1 = questions.nextInt();
        if (1 == answer1){
            StudentCreatorImpl studentCreator = new StudentCreatorImpl();
            studentCreator.OptionsForStudents();
        }
        if (2 == answer1){
            AdministratorCreatorImpl administratorCreator = new AdministratorCreatorImpl();
            administratorCreator.generateAdministrator();
        }
    }
}
