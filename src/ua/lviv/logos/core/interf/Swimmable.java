package ua.lv.lgs.interf;

public interface Swimmable {
    default void swim() {
        System.out.println("Swimmable");
    }
}
