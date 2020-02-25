package ua.lviv.logos.core.external;

import ua.lviv.logos.core.Student;
import ua.lviv.logos.core.User;
import ua.lviv.logos.core.reflection.Human;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List getUsers(){
        List lit = new ArrayList();
        lit.add("string value");
        lit.add(new User());
        lit.add(Integer.valueOf(Integer.MAX_VALUE));
        return lit;
    }

    public static List<User> getParametarsedUser(){
        List<User> lit = new ArrayList<>();
        lit.add(new User());
        lit.add(new User());
        lit.add(new User());
        lit.add(new User());
        lit.add(new User());
        return lit;
    }

    public static <T> List<T> getParamList(T t){
        List<T> resul = new ArrayList<>();
        resul.add(t);
        return resul;
    }

    public static List<User> getUserLisst() {
        List<User> students = new ArrayList<>();
        students.add(new User(25));
        students.add(new User(30));
        return students;
    }

    public static List<Human> getHumanList() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human());
        humans.add(new Human());
        humans.add(new User(25));
        humans.add(new Student(5));
        return humans;
    }

    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1));
        students.add(new Student(2));
        return students;
    }

}
