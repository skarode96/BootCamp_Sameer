package com.company.location;

public class LocationService {

    public static String retrieveLocation(String email) {
        //20 loc to check with Webservice
        if (email.endsWith("@yahoo.com")) {
            return "USA";
        } else {
            return "Pakistan";
        }
    }
}