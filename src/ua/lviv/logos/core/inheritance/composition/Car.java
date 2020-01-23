package ua.lviv.logos.core.inheritance.composition;

public class Car {

    private String color;
    private int year;
    private String model;
    private Engine engine;
    private Person passenger;

    public Car(String color, int year, String model, Engine engine) {
        this.color = color;
        this.year = year;
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        System.out.println("I am starting car ...");
        engine.start();
    }

}
