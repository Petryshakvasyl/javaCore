package ua.lviv.logos.core.interf;

public interface Walkable {
    default void walk(){
        System.out.println("I can walk");
    }

    static void special() {
        System.out.println("special method");
    }
}
