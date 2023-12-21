package com.examplemicroservice1.rest.webservices.restfulwebservices.repository;

import com.examplemicroservice1.rest.webservices.restfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
