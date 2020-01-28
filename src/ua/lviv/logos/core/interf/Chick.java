package ua.lv.lgs.interf;

public class Chick implements Eatable, Walkable {

    @Override
    public void eat() {
        System.out.println("Chick eat ..");
    }

    @Override
    public void walk() {
        System.out.println("Chick walk ..");
    }
}
