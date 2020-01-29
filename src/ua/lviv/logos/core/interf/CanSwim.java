package ua.lviv.logos.core.interf;

public interface CanSwim {
    default void swim() {
        System.out.println("CanSwim");
    }
}
