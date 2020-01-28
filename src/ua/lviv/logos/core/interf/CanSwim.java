package ua.lv.lgs.interf;

public interface CanSwim {
    default void swim() {
        System.out.println("CanSwim");
    }
}
