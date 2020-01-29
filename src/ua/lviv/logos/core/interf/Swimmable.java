package ua.lviv.logos.core.interf;

public interface Swimmable {
    default void swim() {
        System.out.println("Swimmable");
    }
}
