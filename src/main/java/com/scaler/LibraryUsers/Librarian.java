package com.scaler.LibraryUsers;

public class Librarian extends User {

    private String employeeId;


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

    }

    @Override
    public boolean canBorrowBooks(){

        return true;
    }

    public void addBook(Book book){

        System.out.println("Added book in Catalogue: " + book);
    }
    
    public void removeBook(Book book){

        System.out.println("Removed book from Catalogue: " + book);
    }
}
