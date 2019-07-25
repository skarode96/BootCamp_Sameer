package com.company.cinema;

import com.company.cinema.services.*;
import com.company.user.User;

/**
 * Created by karodes on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(123, "Sameer", 19, 2);
        try {
            MovieService.buy(user, 1800);
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        } catch (RatingBelowThreeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            MovieService.watch(user);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
