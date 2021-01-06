package com.cybertek.streams.excercises;

import com.cybertek.OOP.encapsulation.User;
import com.cybertek.OOP.inheritance.Project;
import com.cybertek.enums.Status;
import com.cybertek.enums.Gender;

import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    //Task-1
    public static List<Project> getListOfProject() {
        List<Project> listOfProject = DataGenerator.getProjects();
        return listOfProject;
    }


    //Task-2
    public static List<Project> getListOfProject(Status status) {
        List<Project> listOfProject = DataGenerator.getProjects();
        return listOfProject.stream().filter(st -> st.getProjectStatus().equals(status)).collect(Collectors.toList());
    }


    //Task-3
    public static List<Project> getListOfProject(User manager) {
        List<Project> listOfProject = DataGenerator.getProjects();
        return listOfProject.stream().filter(st -> st.getAssignedManager().equals(manager)).collect(Collectors.toList());
    }

    //Task-4
    public static List<Project> getProjectByProjectCode(String projectCode) {
        List<Project> listOfProject = DataGenerator.getProjects();
        return listOfProject.stream().filter(st -> st.getProjectCode().equals(projectCode)).collect(Collectors.toList());
    }

    //Task-5
    public static List<User> getListUsers() {
        List<User> listUsers = DataGenerator.getUsers();
        return listUsers;
    }

    //Task-6
    public static User getUserByFirstName(String firstName) {
        List<User> userByFirstName = DataGenerator.getUsers();
        return userByFirstName.stream().filter(user -> user.getFirstName().equals(firstName)).findFirst().get();

    }

    //Task-7
//    public static String getUserByUserId(Long id){
//        List<User>userByUserId = DataGenerator.getUsers();
//        return userByUserId.stream().filter(user -> user.getId().
//
//    }
    public static User getUserByUserId(Integer id){
        return DataGenerator.getUsers().stream().filter(user -> user.getRole().getId().equals(id)).findAny().get();
    }

    //Task-8
    public static List<User> deleteUser(String firstName) {
        List<User> list = DataGenerator.getUsers();
        return list.stream().filter(user -> user.getFirstName().equals(firstName)).collect(Collectors.toList());
    }

    //Task-9
    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus) {
        List<Project> projectStatus = DataGenerator.getProjects();
        projectStatus.stream().filter(pro -> pro.getProjectStatus().equals(oldStatus)).forEach(e -> e.setProjectStatus(newStatus));
        return projectStatus;
    }

    //Task-10
    public static List<Project> findProjectByManager(User manager) {
        List<Project> findManager = DataGenerator.getProjects();
        findManager.stream().filter(man -> man.getAssignedManager().equals(manager)).collect(Collectors.toList());
        return findManager;
    }

    //Task-11 - Period
    public static Integer totalProjectDurationForManager(User manager) {
        List<Project> duration = DataGenerator.getProjects();
        Project p = duration.stream().filter(man -> man.getAssignedManager().equals(manager)).findFirst().get();
        Period period = Period.between(p.getStartDate(), p.getEndDate());
        return (int) (long) period.getDays();

    }

    //Task-12
    public static long findTotalMaleInCompany() {
        List<User> male = DataGenerator.getUsers();
        return (long) male.stream().filter(man -> man.getGender().equals(Gender.MALE)).count();
    }
}