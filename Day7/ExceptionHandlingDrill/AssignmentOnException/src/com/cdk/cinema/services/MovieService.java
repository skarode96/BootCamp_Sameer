package com.cdk.cinema.services;

import com.cdk.user.User;

/**
 * Created by karodes on 7/26/2017.
 */
public class MovieService {
    public static void watch(User user) throws AgeInvalidException,RatingBelowThreeException{
            if(user.getAge() < 10) {
                AgeInvalidException ageInvalidException = new AgeInvalidException("Age is below 10....Go home");
                throw ageInvalidException;
            } else if(user.getAge() < 20) {
                AgeInvalidException ageInvalidException = new AgeInvalidException("Age is below 20 .... bye bye buoyyyy");
                throw ageInvalidException;
            }

    }
    public static void buy(User user,double price) throws InvalidPriceException,RatingBelowThreeException {
        if(price < 0) {
            InvalidPriceException invalidPriceException = new InvalidPriceException("Price is invalid");
            throw invalidPriceException;
        }
        if(price < 20000) {
            InvalidPriceException invalidPriceException = new InvalidPriceException("Price is below 20000");
            throw invalidPriceException;
        }
        if(user.getRating() < 3) {
            throw new RatingBelowThreeException("Rating is below 3");
        }
    }
}

