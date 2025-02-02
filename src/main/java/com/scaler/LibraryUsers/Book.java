package com.scaler.LibraryUsers;

public class Book {

    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private String pages;

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

    public Book(){


    }

    public Book(String ISBN, String title, String author, String publisher, String pages) {

        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
    }

    public Book(Book otherBook){

        this.ISBN = otherBook.ISBN;
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.publisher = otherBook.publisher;
        this.pages = otherBook.pages;
    }
}
