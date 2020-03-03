package ua.lviv.logos.core.annotation;

public class Main {
    public static void main(String[] args) {
        Person st = new Person("Jon", "Snow");
        st.voice();

        ObjectToJsonConverter converter = new ObjectToJsonConverter();
        String result = converter.convert(st);
        System.out.println(result);
    }
}
