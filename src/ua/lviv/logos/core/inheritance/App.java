package ua.lviv.logos.core.inheritance;

import ua.lviv.logos.core.inheritance.composition.Car;
import ua.lviv.logos.core.inheritance.composition.Engine;

public class App {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Animal bobik = new Animal("red", 5, "bobik");
//
//        animal.eat();
//        bobik.eat();
//        bobik.speak();
//        animal.speak();


//        Dog dog = new Dog();
//        dog.eat();
//        dog.speak();
//        System.out.println(dog);

//        Dog topic = new Dog("withe", 23, "topic");
//
//        System.out.println(topic);

//        Dog priceless = new Dog("black", 5, "topic");
//        System.out.println(priceless);

//        Dog dogWithPrice = new Dog("black", 5, "topic", 100);
//        System.out.println(dogWithPrice);

//        Bird bird = new Bird();
//        bird.eat();
//        bird.speak();
//        bird.fly();

//        Cat cat = new Cat();
//        cat.eat();
//        cat.speak();
//        cat.scratch();

//        System.out.println(cat);
//        System.out.println(dogWithPrice);

//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Bird bird = new Bird();
//
//        cat.speak();
//        dog.speak();
//        bird.speak();

//        Dog dog = new Dog(10);


        // cpmposition

        Engine engine = new Engine();
        Car car = new Car("black", 2019, "mazda", engine);
        car.start();

    }

}
