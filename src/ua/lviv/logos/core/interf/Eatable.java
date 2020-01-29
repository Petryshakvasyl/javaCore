package ua.lviv.logos.core.interf;

public interface Eatable {
   String FOOD = "Pizza";
    static void prepareFood() {
        System.out.println("I am preparing food ...");
    }

    void eat();
    default void eatDesert(){
        System.out.println("I can eat desert ..");
    }
}
