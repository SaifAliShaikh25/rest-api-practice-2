package com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ErrorDetails {

    private String message;
    private LocalDate localDate;
    private String details;
}
