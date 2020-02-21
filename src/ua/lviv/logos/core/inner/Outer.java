package ua.lviv.logos.core.inner;

public class Outer {

    private String outerString = "Default";
    private static int count = 0;

    public Outer() {
       count++;
    }
    static class Nested{
        private int nInt;

        void doSomth() {
            System.out.println("access: "+ nInt);
            System.out.println("access to out st: "+ count);
//            System.out.println("dont have access to out st: "+ outerString);
            System.out.println("I am from nested");
        }
    }

    class Inner{
        private String outerString;
        private int key = 1;
        private int value = 10;

        public void access() {
            System.out.println("field: " + outerString);
            System.out.println( "Outer field: " + Outer.this.outerString);
            System.out.println("key: " + key);
            System.out.println("value: " + value);
            System.out.println("static : " + count);
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    static void staticMethod(Outer outer) {
        System.out.println(count);
        System.out.println(outer.outerString);
    }

    public void methodForLocalClass(int value) {
        int localVar = 28;
        final int finalLocalVar = 125;

        int notEffFinal = 0;
//        notEffFinal++;
        class Local{
            private int localField;

            void access() {
                System.out.println("outer: " + outerString);
                System.out.println("param: " + value);
                System.out.println("field: " + localField);
                System.out.println("local eff final var: " + localVar);
                System.out.println("local final var: " + finalLocalVar);
                System.out.println("local not eff final var: " + notEffFinal);
            }

            public int getLocalField() {
                return localField;
            }

            public void setLocalField(int localField) {
                this.localField = localField;
            }
        }
        Local l = new Local();
        l.access();
    }

}
