package com.scaler.LibraryUsers;

public class LibraryMember extends User {

    final int maxBorrowingLimit = 5;

    int borrowedBooks;

    public LibraryMember() {

        super();
        borrowedBooks = 0;

    }

    public LibraryMember(String userName, String contactInfo) {

        super(userName, contactInfo);
        borrowedBooks = 0;
    }

    public LibraryMember(LibraryMember otherLibraryMember) {

        super(otherLibraryMember.getUsername(), otherLibraryMember.getContactInfo());
        borrowedBooks = 0;

    }

    @Override
    public void displayDashboard() {

        System.out.println("Library Member Dashboard");
        System.out.println("Name : " + getUsername());
        System.out.println("Contact : " + getContactInfo());
        System.out.println("Books Borrowed : " + borrowedBooks);
    }

    @Override
    public boolean canBorrowBooks(){

        if(borrowedBooks < maxBorrowingLimit){

            return true;
        }
        return false;
    }
}
