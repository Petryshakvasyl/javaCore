package ua.lviv.logos.core.comparator;

import ua.lviv.logos.core.AgeComparator;
import ua.lviv.logos.core.User;

import java.util.*;

import static java.util.Arrays.asList;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("B", "F", "G", "A"));
        System.out.println("unsorted: " + list);
//        Collections.sort(list);
//        System.out.println("sorted: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sorted: " + list);
        String[] array = {"A", "D", "X"};
        System.out.println("unsorted: " + Arrays.toString(array));
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println("sorted: " + Arrays.toString(array));

        Iterator<String> iterator = list.iterator();

        System.out.println("iterator");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "->");
        }

        System.out.println("==========================================");
        System.out.println("modify when iterating");
        System.out.println(list);
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            list.remove("G");
        }
//        System.out.println("modify when iterating");
//        for (String elem : list) {
//            list.remove("G");
//        }

        System.out.println(list);


        List<User> users = new ArrayList<>(
                asList(new User("Petro", "Kopycchak", 35),
                        new User("Ivan", "Kopycchak", 24),
                        new User("Oleg", "Kopycchak", 48),
                        new User("Andriy", "Dolgov", 15),
                        new User("Vasyl", "Petryshak", 25)
        ));
//        users.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
//        Collections.sort(users);
//        System.out.println("after sort: ");
//        users.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
//
//        System.out.println("sort by age: ....");
//
//        users.forEach(user -> System.out.print(user.getLastName() + " " + user.getAge() + "-"));
//        Collections.sort(users, new AgeComparator());
//        System.out.println();
//        users.forEach(user -> System.out.print(user.getLastName() + " " + user.getAge() + "-"));
//
//        ListIterator<User> listIterator = users.listIterator(3);
////        System.out.println("List iterator ... ");
////        while (listIterator.hasNext()) {
////            System.out.println(listIterator.next());
////        }
//
//        System.out.println();
//        System.out.println("List iterator ...  previous");
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }
    }
}
