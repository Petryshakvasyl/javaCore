package ua.lv.lgs.interf;

public class EatableProcessor {

    void process(Eatable eatable) {
        System.out.println("I process eatable ...");
        eatable.eat();
    }
}
