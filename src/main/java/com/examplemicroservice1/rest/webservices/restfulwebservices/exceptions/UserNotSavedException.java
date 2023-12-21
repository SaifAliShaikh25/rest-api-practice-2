package com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions;

public class UserNotSavedException extends RuntimeException {

    private String message;
    public UserNotSavedException(String message){
        super(message);
    }
}
