package com.cybertek.streams;

import com.cybertek.OOP.encapsulation.Role;
import com.cybertek.collections.ArrayLists;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating stream from an Array
        String[] courses = {"Java", "JS", "TS", "API", "Selenium"};
        Stream<String>courseStream = Arrays.stream(courses);


        //Creating a Stream from a Collection
        Stream<Role>roleStream = ArrayLists.createRoleList().stream();

        //Creating a Stream from Specified Values

        Stream<Integer>stream = Stream.of(1,2,3,4,5,6);

        System.out.println(stream);

    }
}
