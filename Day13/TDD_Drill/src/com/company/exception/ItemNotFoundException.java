package com.company.exception;

public class ItemNotFoundException extends Exception {

    public ItemNotFoundException() {

    }

    public ItemNotFoundException(String message) {
        super(message);
    }
}
