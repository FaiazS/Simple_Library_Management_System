package com.scaler.Library;

public class Novel extends Book {

    private String genre;

    public Novel() {

        super();

    }

    public Novel(String ISBN, String title, String author, String genre) {

        super(ISBN, title, author);
        this.genre = genre;

    }

    public Novel(Novel novel) {

        super(novel);
        this.genre = novel.genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

    public String getGenre() {

        return genre;
    }




    @Override
    public void displayBookDetails(){

        System.out.println("Book Details:");
        System.out.println("ISBN: " + getISBN());
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Number of Pages: " + getPages());

    }

    @Override

    public boolean isBookAvailable(User user){

        return true;
    }
}
