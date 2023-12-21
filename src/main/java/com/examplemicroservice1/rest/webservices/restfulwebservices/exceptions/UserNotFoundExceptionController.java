package com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;

@RestControllerAdvice
public class UserNotFoundExceptionController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = UserNotSavedException.class)
    public ResponseEntity<Object> exceptionNotFound(UserNotSavedException userNotSavedException){
        return new ResponseEntity<>("User not saved from controller", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<ErrorDetails> exceptionNotSaved(UserNotFoundException userNotFoundException, WebRequest request){
        return new ResponseEntity<>(ErrorDetails.builder()
                .message(request.getDescription(false))
                .localDate(LocalDate.now())
                .details(userNotFoundException.getMessage()).build(), HttpStatus.BAD_REQUEST);
//        return new ResponseEntity<>("User not saved from Controller advice", HttpStatus.BAD_REQUEST);
    }

}
