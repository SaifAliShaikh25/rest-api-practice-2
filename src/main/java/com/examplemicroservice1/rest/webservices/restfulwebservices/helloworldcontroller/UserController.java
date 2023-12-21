package com.examplemicroservice1.rest.webservices.restfulwebservices.helloworldcontroller;

import com.examplemicroservice1.rest.webservices.restfulwebservices.Services.UserService;
import com.examplemicroservice1.rest.webservices.restfulwebservices.entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("users")
    public ResponseEntity<HttpResponse> saveUser(@Valid @RequestBody User user){
        try{
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception exp){
            throw new UserNotSavedException("Failed to save user - "+user);
        }
    }

    @GetMapping("users/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.findUser(id);
    }
}
