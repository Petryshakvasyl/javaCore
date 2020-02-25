package ua.lviv.logos.core.reflection;

public class Human {
//    private static String value;
//    static {
//        System.out.println("start statsc block, value: " + value);
//        value = "new Value";
//        System.out.println("value after init: " + value);
//        System.out.println("This is a static block in Human class");
//    }

    public void walk(){
        System.out.println("I can walk");
    }

    @Override
    public String toString() {
        return "Human{}";
    }
}
