package ua.lviv.logos.core.interf;

public class App {

    public static void main(String[] args) {
        EatableProcessor processor = new EatableProcessor();

        //        Eatable chick = new Chick();
        //        chick.eat();
        //
        //        Chick chick1 = (Chick) chick;
        //        chick1.walk();

        //        Eatable duck = new Duck();
        //        Chick chickDuck = (Chick) duck;
        //        Eatable duck = new Duck();
        //        Eatable chick = new Chick();
        //
        //        processor.process(duck);
        //        processor.process(chick);

        //        Duck duck = new Duck();
        //        duck.eatDesert();
        //
        //        Eatable.prepareFood();
        //        System.out.println(Eatable.FOOD);
        Duck duck = new Duck();
        duck.eatDesert();
        duck.swim();

    }
}
