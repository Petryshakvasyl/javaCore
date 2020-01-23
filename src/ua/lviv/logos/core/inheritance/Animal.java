package ua.lviv.logos.core.inheritance;

public class Animal {

    private String color;
    private int age;
    private String name;

    public Animal(String color, int age, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
        System.out.println("I build animal");
    }

    public void eat() {
        System.out.println("I am eating ...");
    }

    public void speak() {
        System.out.println("I am speaking ..");
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
