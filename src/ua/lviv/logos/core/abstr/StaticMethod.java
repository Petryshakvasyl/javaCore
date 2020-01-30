package ua.lviv.logos.core.abstr;

public class StaticMethod {
    private String name;
    public static int staticField;

    public int getStaticField() {
        return staticField;
    }

    public void setStaticField(int i) {
        staticField = i;
    }

    public static void staticMethod() {
        System.out.println(staticField);

        System.out.println("I am static method: staticMethod");
    }

    public static void staticMethod2() {
        System.out.println("I am static method: staticMethod2");
    }

    public void notStatic() {
        System.out.println("name is " + name);
        System.out.println("name is " + staticField);
        System.out.println("I am not static");
    }

}
