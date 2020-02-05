package ua.lviv.logos.core.string;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String s = "ass";

        //        String replased = s.replace('a', 'b');
        //
        //        System.out.println(s);
        //        System.out.println(replased);

        Integer i1 = -128;
        Integer i2 = new Integer(1);
        Integer i3 = -128;

//        System.out.println(i1 == i2);
//        System.out.println(i1 == i3);

//        System.out.println("hello".charAt(7));
//        System.out.println("hello".charAt(7));
//        System.out.println("hello".indexOf('e', -3) );
//        System.out.println("hello".lastIndexOf('e', -3) );
        System.out.println("б".compareTo("а"));
        System.out.println("б".compareToIgnoreCase("а"));


        String love = "I love java";
        System.out.println(love.charAt(2));
        String result = String.join(" ", love, "hello", "hell", "xxx");

        System.out.println(result);

        StringBuilder sb = new StringBuilder(love);
        System.out.println(sb.length());
//        sb.setLength(25);
        System.out.println(sb.length());

        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb.capacity());
        System.out.println(sb2.capacity());

        sb.reverse();
//        System.out.println(sb);

        sb.reverse();
        sb.append(" very");
        sb.append(" very much");
//        String res = new String(sb);
//        String res2 = String.valueOf(sb);
//        System.out.println(res);
//        System.out.println(res2);

        sb.delete(2, 5);
        System.out.println(sb);

    }

}
