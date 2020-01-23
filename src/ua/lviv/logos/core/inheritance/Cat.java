package ua.lviv.logos.core.inheritance;

public class Cat extends Animal {

    public Cat(String color, int age, String name) {
        super(color, age, name);
    }

    public void scratch() {
        System.out.println("I am scratching ...");
    }

    @Override
    public void speak() {
        System.out.println(" May ...");
    }

}
