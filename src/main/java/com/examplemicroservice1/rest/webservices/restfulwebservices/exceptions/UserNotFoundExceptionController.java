package com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundExceptionController {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Object> exceptionNotFound(UserNotFoundException userNotFoundException){
        return new ResponseEntity<>("User not found from controller", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = UserNotSavedException.class)
    public ResponseEntity<Object> exceptionNotSaved(UserNotSavedException userNotSavedException){
        return new ResponseEntity<>("User not saved from Controller advice", HttpStatus.BAD_REQUEST);
    }

}
