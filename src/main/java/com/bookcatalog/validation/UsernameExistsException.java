package com.bookcatalog.validation;

public class UsernameExistsException extends Throwable {

    public UsernameExistsException() {
    }

    public UsernameExistsException(String message) {
        super(message);
    }
}
