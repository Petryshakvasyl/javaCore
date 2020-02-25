package ua.lviv.logos.core.generics;

import ua.lviv.logos.core.Student;
import ua.lviv.logos.core.User;
import ua.lviv.logos.core.external.Util;
import ua.lviv.logos.core.reflection.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List lit = Util.getUsers();
//        for (Object o : lit) {
//            if(o instanceof User){
//                User u = (User) o;
//                System.out.println(u);
//            }
//        }
//
//        List<User> paramList = Util.getParametarsedUser();
//        System.out.println(paramList);
//        for (User user : paramList) {
//            System.out.println(user);
//        }

        User user = new User("Jon", "Snow", 50);
//        List<User> users = Util.getParamList(user);
//        for (User user1 : users) {
//            System.out.println(user);
//        }

        Optional<Object> optional = new Optional<>(user);
        System.out.println(optional.getValue());
        optional.setValue(new Student(1));
        Object user1 = optional.getValue();

        Optional<Student> studentOptional = new Optional<>(new Student(2));

//        optional.setValue(new Object());

//        Optional raw = new Optional(user);
//        raw.setValue(new Object());
//
//        UserOptional extendetOptional = new UserOptional(new Student(1));

//        List<? super User> to = getUserLisst();
//        Human us = (Human)to.get(0);
////        System.out.println(us);
////        from.set(0, new User());
//        User st = (User)to.get(0);
//        st.walk();


        // Upper Bounded Wildcards : ? extends
        List<Human> humans = Util.getHumanList();
        //List<Human> humansUser = getUserLisst(); //compile error: invariant only List<Human> can be
        //List<Human> humanStudents = getStudentList(); //compile error: invariant only List<Human> can be
        List<? extends Human> humanProduser = Util.getHumanList();
        List<? extends Human> humansUser = Util.getUserLisst();
        List<? extends Human> humanStudents = Util.getHumanList();
        humanProduser.add(null); // we can add only null for the ? extends wildcard
//        humans1.add(new User(24));  //compile error: we can not add an object to ? extends wildcard
//        humans1.add(new Human()); //compile error: we can not add an object to ? extends wildcard
//        humans1.add(new Student(1)); //compile error: we can not add an object to ? extends wildcard

        for (Human human : humanProduser) {
            System.out.println(human);
        }

        //Lower Bounded Wildcards
        System.out.println("=============Lower Bounded Wildcards=====================");
        List<? super User> studentConsumer1 = Util.getHumanList();
        List<? super User> studentConsumer2 = Util.getUserLisst();
        //List<? super User> studentConsumer = Util.getStudentList(); //compile error: it should be at least List of User or super of User
        studentConsumer1.add(new User());
        studentConsumer1.add(new Student(1));
//        studentConsumer1.add(new Human()); // compile error

        // compile error: we can NOT get from Lower Bounded Wildcards
//        for (User u : studentConsumer1) {
//            System.out.println(u);
//        }

        //we can get from Lower Bounded Wildcards only Object
        for (Object o : studentConsumer1) {
            System.out.println(o);
        }

    }

}
