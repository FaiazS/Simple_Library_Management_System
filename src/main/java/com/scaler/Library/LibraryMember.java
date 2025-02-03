package com.scaler.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember extends User {

    private final static int maxBorrowingLimit = 5;

    private int borrowedBooks;

    private List<Book> borrowedBookList = new ArrayList<Book>();

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



    public int getBorrowedBooks() {

        return borrowedBooks;
    }

    @Override
    public void displayDashboard() {

        System.out.println("Library Member Dashboard");
        System.out.println("Name : " + getUsername());
        System.out.println("Contact : " + getContactInfo());
        System.out.println("Books Borrowed : " + borrowedBooks);

        for(Book book : borrowedBookList) {

            System.out.println("List :" + book);
        }
    }

    @Override
    public boolean canBorrowBooks(){

        if(borrowedBooks < maxBorrowingLimit){

            return true;
        }
        return false;
    }

    @Override

    public void canReturnBooks(){

        borrowedBooks -= 1;
    }
}
