package ua.lviv.logos.core.inheritance;

public class Dog extends Animal {

    private int price;

    public Dog(String color, int age, String name) {
        super(color, age, name);
    }

    public Dog(String color, int age, String name, int price) {
        super(color, age, name);
        this.price = price;
    }

    public Dog(int price) {
        super("white", 0, "bobic");
        this.price = price;
        System.out.println(" I biuld a dog");
    }

    @Override
    public void speak() {
        System.out.println("Gav ...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color = " + getColor() + ", "+
                "age = " + getAge() + ", " +
                "name = " + getName() + ", " +
                "price = " + getPrice() +
                 "}";
    }

    public int getPrice() {
        return price;
    }
}
