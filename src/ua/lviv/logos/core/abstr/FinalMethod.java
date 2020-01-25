package ua.lviv.logos.core.abstr;

public class FinalMethod {

    public final void f() {
        System.out.println("I am final");
    }

    public void g() {
        System.out.println("I am not final");
    }
}
