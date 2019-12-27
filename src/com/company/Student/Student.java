package com.company.Student;

import com.company.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Student  {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getStudyAdress() {
        return studyAdress;
    }

    public void setStudyAdress(String studyAdress) {
        this.studyAdress = studyAdress;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    private String studyAdress;
    private String group;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }


}
