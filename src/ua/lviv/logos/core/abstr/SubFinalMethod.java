package ua.lviv.logos.core.abstr;

public class SubFinalMethod extends FinalMethod {

    //can not be overrided
//    public void f() {
//
//    }

    @Override
    public void g() {
        System.out.println(" I am overrided");
    }
}
