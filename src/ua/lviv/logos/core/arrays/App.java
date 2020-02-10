package ua.lviv.logos.core.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.pollFirst();

        System.out.println(list);
    }
}
