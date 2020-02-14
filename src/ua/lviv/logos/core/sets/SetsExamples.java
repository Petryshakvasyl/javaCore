package ua.lviv.logos.core.sets;

import ua.lviv.logos.core.AgeComparator;
import ua.lviv.logos.core.User;

import java.util.*;

public class SetsExamples {
    public static void main(String[] args) {

        Set<User> users = new TreeSet<>(new AgeComparator());
        users.add(new User("Jon", "Snow", 30));
        users.add(new User("Devid", "Wetto", 25));
        users.add(new User("Volodymyr", "Snow", 28));
        users.add(new User("Andriy", "Melnyk", 60));
        users.add(new User("Ivan", "Drozd", 84));

//        users.forEach(user -> System.out.println(user));

        Queue<User> queue = new PriorityQueue<>();

        queue.add(new User("Jon", "Snow", 30));
        queue.add(new User("Devid", "Wetto", 25));
        queue.add(new User("Volodymyr", "Snow", 28));
        queue.add(new User("Andriy", "Melnyk", 60));
        queue.add(new User("Ivan", "Drozd", 84));

        for (User u : queue) {
            System.out.println(u);
        }

        System.out.println("Peeking .....");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
