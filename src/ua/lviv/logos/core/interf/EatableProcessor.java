package ua.lviv.logos.core.interf;

public class EatableProcessor {

    void process(Eatable eatable) {
        System.out.println("I process eatable ...");
        eatable.eat();
    }
}
