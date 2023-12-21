package com.examplemicroservice1.rest.webservices.restfulwebservices.helloworldcontroller;

import com.examplemicroservice1.rest.webservices.restfulwebservices.helloworldbean.HelloWorldBean;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping
    public String getHelloMessage(){
        return "Hello World !";
    }

    @GetMapping("hello-bean")
    public HelloWorldBean getHelloBean(){
        return HelloWorldBean.builder().message("Hello from Bean").build();
    }

    @GetMapping("hello-{name}")
    public HelloWorldBean getHelloName(@PathVariable("name") String name){
        return HelloWorldBean.builder().name(name).message("Hello "+name).build();
    }
}
