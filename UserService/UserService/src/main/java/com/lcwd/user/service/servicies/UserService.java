package com.lcwd.user.service.servicies;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {


    User saveUser(User user);


    List<User> getAllUser();


    User getUser(String UserId);
}
