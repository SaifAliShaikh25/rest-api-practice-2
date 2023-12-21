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
       Optional<User> user =  Optional.of(userRepository.findById(id)).orElseThrow(() -> new UserNotFoundException("User not available for id "+id));
        if(user.isPresent())
            return user.get();
        else
            throw new UserNotFoundException("User not available for id "+id+". Hence throwing exception");
    }
}
