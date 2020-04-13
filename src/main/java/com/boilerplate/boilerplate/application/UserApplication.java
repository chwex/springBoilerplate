package com.boilerplate.boilerplate.application;

import com.boilerplate.boilerplate.domain.entities.User;
import com.boilerplate.boilerplate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserApplication {
    private final UserRepository userRepository;

    @Autowired
    public UserApplication(
            UserRepository userRepository
    ){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        List<User> lstUsers = this.userRepository.findAll();
        return lstUsers;
    }

    public User getUser(Integer id){
        User user = this.userRepository.getOne(id);
        return user;
    }
}
