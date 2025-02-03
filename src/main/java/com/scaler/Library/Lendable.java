package com.scaler.Library;

public interface Lendable {

    boolean lendBook(User user);

    void returnBook(User user);

    boolean isBookAvailable(User user);

}
