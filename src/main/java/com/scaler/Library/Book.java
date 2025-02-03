package com.scaler.Library;

import java.io.Serializable;

public abstract class Book implements Lendable {

    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private String pages;
    private boolean isAvailable;

    public void setISBN(String ISBN){

        this.ISBN = ISBN;
    }

    public String getISBN(){

        return ISBN;
    }

    public void setTitle(String title){

        this.title = title;
    }

    public String getTitle(){

        return title;
    }

    public void setAuthor(String author){

        this.author = author;
    }

    public String getAuthor(){

        return author;
    }

    public void setPublisher(String publisher){

        this.publisher = publisher;
    }
    public String getPublisher(){

        return publisher;
    }

    public void setPages(String pages){

        this.pages = pages;
    }

    public String getPages(){

        return pages;
    }

    public void setAvailable(boolean isAvailable){

        this.isAvailable = isAvailable;
    }
    public boolean getAvailable(){

        return isAvailable;
    }

    public Book(){

        isAvailable = true;


    }

    public Book(String ISBN, String title, String author, String publisher, String pages, boolean isAvailable) {

        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.isAvailable = true;
    }

    public Book(String ISBN, String title, String author){

        this.ISBN = ISBN;
        this.title = title;
        this.author = author;

    }

    public Book(Book otherBook){

        this.ISBN = otherBook.ISBN;
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.publisher = otherBook.publisher;
        this.pages = otherBook.pages;
        this.isAvailable = otherBook.isAvailable;
    }

    @Override
    public boolean lendBook(User user) {

        if(isAvailable && user.canBorrowBooks()){

            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user){

        isAvailable = true;
        user.canReturnBooks();
    }

    public abstract void displayBookDetails();

}
