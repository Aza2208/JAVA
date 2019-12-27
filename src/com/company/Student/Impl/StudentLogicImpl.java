package com.company.Student.Impl;

import com.company.Book.BookHelper;
import com.company.Book.Book;
import com.company.Book.Impl.BookHelperImpl;
import com.company.Student.Student;
import com.company.Student.StudentLogic;

import java.util.List;
import java.util.Scanner;

public class StudentLogicImpl implements StudentLogic {
    @Override
    public void implementStudentLogic() {
        BookHelper bookHelper = new BookHelperImpl();
        List<Book> books = bookHelper.generateRandomBooks();

        System.out.print(" Write your first name: ".toUpperCase());
        String scannerFirstName = new Scanner(System.in).nextLine().toLowerCase();
        Student student = new Student();
        student.setFirstName(scannerFirstName);

        System.out.print(" Write your last name: ".toUpperCase());
        String scannerLastName = new Scanner(System.in).nextLine().toLowerCase();
        student.setLastName(scannerLastName);

        System.out.println("\n" + "Welcome ".toUpperCase() + student.getFirstName().toUpperCase()
                + " " + student.getLastName().toUpperCase() + "!" + "\n");

        while (true) {
            System.out.println(" Chose what you want:".toUpperCase());
            System.out.println(" Press 0 if you want to exit ".toUpperCase());
            System.out.println(" Press 1 if you want to get books".toUpperCase());
            System.out.println(" Press 2 if you want to give books".toUpperCase());
            int giveGetAnswer = new Scanner(System.in).nextInt();

            if (1 != giveGetAnswer && 2 != giveGetAnswer && 0 != giveGetAnswer) {
                System.out.println("error!".toUpperCase());
            }

            if (0 == giveGetAnswer) {
                break;
            }
            if (1 == giveGetAnswer) {
                System.out.println(" There are available books ".toUpperCase());
                int i = 1;
                for (Book book : bookHelper.generateRandomBooks()) {
                    System.out.println(i + ". " + book.getBookName() + " - " + book.getAuthorName());
                    i++;
                }

                System.out.println(" Choose book number ".toUpperCase());
                int selectBookID = new Scanner(System.in).nextInt();
                if (selectBookID > books.size()) {
                    System.out.println(" Your num is bigger than book list size, please write correctly!".toUpperCase());
                    break;
                }

                Book book = books.get(selectBookID - 1);
                student.getBooks().add(book);
                System.out.println("You took ".toUpperCase() + book.getBookName().toUpperCase() + " book".toUpperCase());

            } else if (2 == giveGetAnswer) {

                int a = 1;
                for (Book book : student.getBooks()) {
                    System.out.println(a + ". " + book.getBookName() + " - " + book.getAuthorName());
                    a++;
                }
                if (student.getBooks().isEmpty()){
                    System.out.println(" Sorry, you haven't a book!".toUpperCase());
                    break;
                }
                System.out.println(" What you want?".toUpperCase());
                System.out.println("Press book ID and you will give it".toUpperCase());
                int bookID = new Scanner(System.in).nextInt();

                if (bookID > books.size()) {
                    System.out.println("error!".toUpperCase() + " You have only ".toUpperCase()
                            + student.getBooks().size() + " books".toUpperCase());
                }

                Book book = student.getBooks().get(bookID - 1);

                student.getBooks().remove(book);

                System.out.println("Now you have ".toUpperCase() + student.getBooks().size() + " books".toUpperCase());
            }
        }
    }
}


