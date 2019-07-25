package com.company.cinema.services;

/**
 * Created by karodes on 7/26/2017.
 */
public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}
