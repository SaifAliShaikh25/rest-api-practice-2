package com.examplemicroservice1.rest.webservices.restfulwebservices.Services;

import com.examplemicroservice1.rest.webservices.restfulwebservices.entity.User;
import com.examplemicroservice1.rest.webservices.restfulwebservices.exceptions.UserNotFoundException;
import com.examplemicroservice1.rest.webservices.restfulwebservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User findUser(int id){
        User user =  userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not available for id "+id));
        return user;
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
}
