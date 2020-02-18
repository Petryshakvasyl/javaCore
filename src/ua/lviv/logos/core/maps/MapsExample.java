package ua.lviv.logos.core.maps;

import ua.lviv.logos.core.User;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        int initialCapacity = 1<<30;
        System.out.println("1<<30:               " + initialCapacity);
        System.out.println("Integer.MAX_VALUE/2: " + Integer.MAX_VALUE/2 );
        System.out.println("Math.pow(2, 30):     " + (int)Math.pow(2, 30));
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Hate it");
        map.put(Integer.MAX_VALUE, "max value");
        map.put(null, "Happy");
        map.put(null, "Happy New");

        System.out.println(map);
        System.out.println("null value: " + map.get(null));
        System.out.println("map size: " + map.size());

        Collection<String> values = map.values();
        System.out.println("values: " + values);
        System.out.println("keys: " + map.keySet());
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String>> setIterator = entries.iterator();
        System.out.println(";;;;; ITERATOR Map.Entry");
        while (setIterator.hasNext()) {
            Map.Entry<Integer, String> next = setIterator.next();
            System.out.println("key: " + next.getKey());
            System.out.println("value: " + next.getValue());
        }
        System.out.println("keys and value: " + entries);
        System.out.println("FOR EACH");
        for (Map.Entry entry : entries) {
            System.out.println("key:" + entry.getKey() +
                    "value: " + entry.getValue());
        }

        Collection<String> values1 = map.values();
        boolean contains = false;
        for (String v : values1) {
            if (v.equals("Happy New")) {
                contains = true;
            }
        }
        System.out.println(contains);

        SortedMap<Integer, User> users = new TreeMap<>();

        users.put(1, new User("Jon", "Snow", 35));
        User user = new User("Andry", "Derik", 58);
        users.put(2, user);
        users.put(3, new User("Ivan", "Sosna", 18));

        System.out.println("hadMap: " + users.headMap(2));
        System.out.println("tailMap: " + users.tailMap(2));
        System.out.println("subMap: " + users.subMap(2, 3));
        System.out.println("subMap: " + users.subMap(2, 3));
//        System.out.println("125: " + 125%16);
//        System.out.println("28: " + 28%16);
//        System.out.println("35: " + 35%16);
        System.out.println(users);
        System.out.println(Integer.valueOf(125).hashCode());
        System.out.println(users.containsValue(user));
        boolean containsDerik = false;
        Collection<User> usersValues = users.values();
        for (User u : usersValues) {
            if (u.getLastName().equals("Derik")) {
                containsDerik = true;
            }
        }

        System.out.println("contains Derik: " + containsDerik);
//        map.put(null, "dont know");
//        for (int i = 0; i < initialCapacity; i++) {
//            System.out.println(i);
//            map.put(i, "value" + i % 2 + 3);
//        }

//        IntStream.range(0, initialCapacity).parallel().forEach(i ->{
//            System.out.println(i);
//            map.put(i, "value" + i % 2 + 3);
//        });

//        System.out.println("hashcode: " + Integer.valueOf(12702).hashCode());
//        System.out.println(map);
//        System.out.println(1 << 30);
//        System.out.println(Integer.toBinaryString(1));
//        System.out.println(Integer.toBinaryString(1073741824));

     }
}
