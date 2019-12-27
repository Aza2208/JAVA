package com.company.Admin.Impl;

import com.company.Book.Book;
import com.company.Book.BookHelper;
import com.company.Book.Impl.BookHelperImpl;
import com.company.Student.Impl.StudentHelperImpl;
import com.company.Admin.AdminLogic;
import com.company.Student.Student;
import com.company.Student.StudentHelper;

import java.util.List;
import java.util.Scanner;

public class AdminLogicImpl implements AdminLogic {
    @Override
    public void implementAdminLogic() {
        StudentHelper studentHelper = new StudentHelperImpl();
        List<Student> students = studentHelper.generateStudents();

        while (true){
            System.out.println(" Chose what you want:".toUpperCase());
            System.out.println(" Press 0 if you want to exit ".toUpperCase());
            System.out.println(" Press 1 if you want to get student list".toUpperCase());
            System.out.println(" Press 2 if you want to get book list".toUpperCase());
            int adminAnswer = new Scanner(System.in).nextInt();
            if (1 != adminAnswer && 2 != adminAnswer && 0 != adminAnswer) {
                System.out.println("error!".toUpperCase());
            }

            if (0 == adminAnswer) {
                break;
            }
            if (adminAnswer == 1) {
                int i = 1;
                for (Student student : students) {
                    System.out.println(i + ". " + student.getFirstName() + " " + student.getLastName());
                    i++;
                }
                System.out.println("\n" + "if you want to know information about students click on them number".toUpperCase());
                System.out.println("If you want exit press 0 ".toUpperCase());

                while (true){

                    int studentId = new Scanner(System.in).nextInt();//1
                    if (studentId == 0){
                        break;
                    }
                    if (studentId > students.size()){
                        System.out.println(" Your number is bigger than student list, please write correctly! ".toUpperCase());
                        break;
                    }

                    Student studentNum = studentHelper.generateStudents().get(studentId-1);
                    studentHelper.generateStudents().get(studentId-1).getBooks();
                    System.out.println("First name: " + studentNum.getFirstName());
                    System.out.println("Last name: " + studentNum.getLastName());
                    System.out.println("Call number: " + studentNum.getPhoneNumber());
                    System.out.println("Place of study: " + studentNum.getStudyAdress());
                    System.out.println("Specialty: " + studentNum.getGroup());
                    System.out.println("Place of Birth: " + studentNum.getAdress());

                    for (Book book : studentHelper.generateStudents().get(studentId-1).getBooks()){
                        System.out.println("Books: " + book.getBookName() + " - " + book.getAuthorName());
                    }

                    System.out.println("If you want exit press 0 ".toUpperCase());
                }

            }
            if (adminAnswer == 2) {
                BookHelper bookHelper = new BookHelperImpl();
                int i = 1;
                for (Book book : bookHelper.generateRandomBooks()) {
                    System.out.println(i + ". " + book.getBookName() + " - " + book.getAuthorName());
                    i++;
                }
            }
            break;
        }
    }
}


        /*try {
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
                BookHelperImpl bci = new BookHelperImpl();
                Books books = new Books();
                bci.generateBooks();
            }
            if (2 == answer4){
                System.out.println(" All students list: ");
                StudentHelperImpl sci = new StudentHelperImpl();
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
*/
