package com.cdk.cinema.services;

/**
 * Created by karodes on 7/26/2017.
 */
public class RatingBelowThreeException extends Exception {
    public RatingBelowThreeException(String message) {
        super(message);
    }
}
