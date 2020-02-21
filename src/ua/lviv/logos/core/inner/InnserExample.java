package ua.lviv.logos.core.inner;

public class InnserExample {
    public static void main(String[] args) {

        Outer.Nested nested = new Outer.Nested();

//        nested.doSomth();

        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
//        inner.access();

        outer.methodForLocalClass(25);

//        System.out.println(inner.getClass().getSuperclass().getSimpleName());

        Annonimous annonimous = new AnnonimousImplementation();
        annonimous.hedle("some");
        annonimous.random();

        Annonimous annonimous1 = new Annonimous() {
            @Override
            public void hedle(String value) {
                System.out.println("hadled value: "+ value);
            }

            @Override
            public boolean random() {
                return false;
            }
        };

        annonimous1.random();
        annonimous1.hedle("ddffd");

    }
}
