package com.cybertek.OOP.abstraction.service;

import com.cybertek.OOP.encapsulation.User;
import com.cybertek.OOP.encapsulation.Role;
import com.cybertek.OOP.abstraction.implementation.UserServiceImplementation;
import com.cybertek.enums.Gender;

public class UserService implements UserServiceImplementation {
    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike","Smith",new Role(id,"Admin"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }
    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName,"Ally",new Role(5,"Employee"),Gender.MALE);
        return user;
    }
}