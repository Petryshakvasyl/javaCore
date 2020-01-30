package ua.lviv.logos.core.inheritance;

public class Bird extends Animal {

    public Bird(String color, int age, String name) {
        super(color, age, name);
    }

    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void speak() {
        super.speak();
    }
}
