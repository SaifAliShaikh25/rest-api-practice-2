package com.examplemicroservice1.rest.webservices.restfulwebservices.helloworldbean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class HelloWorldBean {

    private String name;
    private String message;

}
