package ua.lv.lgs.interf;

public class Duck implements Eatable, Walkable, Swimmable, CanSwim {

    @Override
    public void eat() {
        System.out.println("Duck eat ..");
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
        CanSwim.super.swim();
    }

    @Override
    public void walk() {
        System.out.println("Duck walk");
    }
}
