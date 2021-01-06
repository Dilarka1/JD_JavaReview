package com.cybertek.OOP.abstraction.implementation;

import com.cybertek.OOP.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleId(int id);
    User userByFirstName(String firstName);
}
