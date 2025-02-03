package com.scaler.Library;

public class Textbook extends Book {

    private String subject;
    private int edition;

    public Textbook() {

        super();

    }

    public Textbook(String ISBN,String title, String author, String subject, int edition) {

        super(ISBN, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    public Textbook(Textbook textbook ) {

        super(textbook);
        this.subject = textbook.subject;
        this.edition = textbook.edition;
    }

    public void setSubject(String subject) {

        this.subject = subject;
    }

    public String getSubject() {

        return subject;
    }

    public void setEdition(int edition) {

        this.edition = edition;

    }

    public int getEdition() {

        return edition;
    }

    @Override
    public void displayBookDetails() {

        System.out.println("Book details");
        System.out.println("ISBN: " + getISBN());
        System.out.println("Subject: " + getSubject());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Edition: " + getEdition());
        System.out.println("Number Of Pages: " + getPages());

    }

    @Override

    public boolean isBookAvailable(User user){

        return true;
    }
}
