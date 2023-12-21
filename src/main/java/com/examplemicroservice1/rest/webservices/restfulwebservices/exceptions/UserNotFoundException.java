package com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions;

public class UserNotFoundException extends RuntimeException{

    private String message;
    public UserNotFoundException(String message){
        super();
        this.message = message;
    }
}
