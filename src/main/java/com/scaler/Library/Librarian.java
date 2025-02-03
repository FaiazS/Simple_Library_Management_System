package com.scaler.Library;

import java.util.List;

public class Librarian extends User {

    private String employeeId;
    private List<Book> books;


    public Librarian() {

        super();

    }

    public Librarian(String employeeId, String userName, String contactInfo) {

        super(userName, contactInfo);
        this.employeeId = employeeId;

    }

    public Librarian(Librarian otherLibrarian) {

        super(otherLibrarian.getUsername(), otherLibrarian.getContactInfo());

        this.employeeId = otherLibrarian.employeeId;

    }

    public String getEmployeeId() {

        return employeeId;
    }

    @Override
    public void displayDashboard(){

        System.out.println("Librarian Dashboard");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + getUsername());
        System.out.println("Contact Info: " + getContactInfo());

        for(Book book : books){

            System.out.println("Books read: " + book);
        }
    }

    @Override
    public boolean canBorrowBooks(){

        return true;
    }
    @Override
    public void canReturnBooks(){

        System.out.println("Librarian Can Return Books");
    }

    public void addBook(Book book){

        System.out.println("Added book in Catalogue: " + book);
    }

    public void removeBook(Book book){

        System.out.println("Removed book from Catalogue: " + book);
    }
}
