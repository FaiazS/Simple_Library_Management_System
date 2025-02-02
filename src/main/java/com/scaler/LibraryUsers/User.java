package com.scaler.LibraryUsers;

public abstract class User {

    private String userId;

    private String userName;

    private String contactInfo;

    private static int totalUsers = 0;

    public String getUserId() {

        return userId;
    }

    public void setUsername(String username){

        this.userName = username;
    }

    public String getUsername(){

        return this.userName;
    }

    public void setContactInfo(String contactInfo){

        this.contactInfo = contactInfo;
    }

    public String getContactInfo(){

        return this.contactInfo;
    }

    public User(){

        this.userId = generateUniqueID();
    }

    public final String generateUniqueID(){

        totalUsers += 1;
        return "user_" + totalUsers;
    }

    public User(String userName, String contactInfo){

        this.userId = generateUniqueID();
        this.userName = userName;
        this.contactInfo = contactInfo;
    }

    public User(User otherUser){

        otherUser.userId = generateUniqueID();
        this.userName = otherUser.userName;
        this.contactInfo = otherUser.contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

}
