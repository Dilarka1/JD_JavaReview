package com.cybertek;

import com.cybertek.OOP.encapsulation.Role;
import com.cybertek.OOP.encapsulation.User;
import com.cybertek.OOP.inheritance.BaseEntity;
import com.cybertek.OOP.inheritance.Project;
import com.cybertek.OOP.polymorphysm.Employee;
import com.cybertek.OOP.abstraction.implementation.UserServiceImplementation;
import com.cybertek.OOP.abstraction.service.UserService;
import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //******CORE******//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        methods.methodB();
        methods.methodB(5);
        Methods.methodC();

        //*********LOOP**********//

        Loops.demoForIteration();
        Loops.demoForEach();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        //*********OOP-Encapsulation**********//

        User user = new User("Mike", "Smith", new Role(2, "Manager"), Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());


        //*********OOP-Inheritance**********//

        Project project = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().minusHours(5), 1, "PRJ001", "Human Resource CRM",
                new User("Mike", "Smith", new Role(1, "Manager"), Gender.MALE),
                LocalDate.now(), LocalDate.now().plusMonths(6), Status.IN_PROGRESS, "HCRM Detail Information");

        //*********OOP-Interface**********//

        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

        //*********OOP-Polymorphism**********//
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();

        employee.getEmployeeHours();

        ((Employee) employee2).getEmployeeHours(); //Down casting


        //*********Enum**********//

        System.out.println(Gender.FEMALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));
    }
}
