package ua.lv.lgs.delegation;

public class DelegationApp {

    public static void main(String[] args) {
        List list = new List();
        list.add("First string");
        list.add("Second string");
        list.add("Third string");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
