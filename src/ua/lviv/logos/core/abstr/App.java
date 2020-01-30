package ua.lviv.logos.core.abstr;

public class App {

    public static void main(String[] args) {
//        FinalMethod finalMethod = new FinalMethod();
//        finalMethod.f();

//        System.out.println(FinalField.MY_CONSTANT);
//        StaticMethod object = new StaticMethod();
//        StaticMethod object1 = new StaticMethod();
//        object.staticMethod();
//        object.notStatic();
//        StaticMethod.staticMethod();

        StaticMethod object = new StaticMethod();
        StaticMethod object1 = new StaticMethod();
        StaticMethod.staticField = 1;
        object.setStaticField(5);
        object1.setStaticField(10);
        System.out.println(object.getStaticField());
        System.out.println(object1.getStaticField());

    }

}
