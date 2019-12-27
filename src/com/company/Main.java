package com.company;

import com.company.Admin.AdminLogic;
import com.company.Admin.Impl.AdminLogicImpl;
import com.company.Student.Impl.StudentLogicImpl;
import com.company.Student.StudentLogic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentLogic studentLogic = new StudentLogicImpl();
        AdminLogic adminLogic = new AdminLogicImpl();

        while (true) {

            System.out.print(" Who are you? ".toUpperCase());
            String answer = new Scanner(System.in).nextLine().toLowerCase();

            if (answer.equals("student")) {
                studentLogic.implementStudentLogic();
            }else if (answer.equals("admin")) {
                adminLogic.implementAdminLogic();
            }
        }

    }
}