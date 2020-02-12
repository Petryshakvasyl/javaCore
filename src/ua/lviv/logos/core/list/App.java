package ua.lviv.logos.core.list;

import java.util.*;

public class App {

    public static void main(String[] args) {
        List<String> arrayList = ListUtils.createArrayList();
        List<String> linkedList = ListUtils.createLinkedList();
        //List in list
        //        List<String> innerList = new ArrayList<>(Arrays.asList("A","C", "F"));
        //        List<String> innerList2 = new ArrayList<>(Arrays.asList("A","B"));
        //        List<List<String>> complexList = new ArrayList<>(Arrays.asList(innerList, innerList2));
        //        complexList.add(innerList2);
        //        System.out.println(complexList.size());
        //        System.out.println(complexList.contains(innerList));


        processList(arrayList);
        //        processList(linkedList);
        //        processList(null);
    }

    static void processList(List<String> list) {

        if (list != null && !list.isEmpty()) {
            //            System.out.println(list);
            String simpleName = list.getClass().getSimpleName();
            //            System.out.println(simpleName + ": " + list);
            //            list.add(2, "Inserted");
            //            System.out.println("after insert: " + simpleName + ": " + list);
            //            list.set(2, "set value");
            //            System.out.println("after set: " + simpleName + ": " + list);
            //            //        list.add(null);
            //            //        System.out.println("after add null: " + simpleName + ": " + list);
            //            //        for (String value : list) {
            //            //            if (value != null) {
            //            //                System.out.println(value.length());
            //            //            }
            //            //        }
            //
            //            System.out.println("contains: " + simpleName + " " + list.contains("A"));
            //            System.out.println("contains: " + simpleName + " " + list.size());
            // clear copy
            //            List<String> listBasedOnList = new LinkedList<>(list);
            //            System.out.println("main : " + list);
            //            System.out.println("cope : " + listBasedOnList);
            //
            //            listBasedOnList.clear();
            //            System.out.println("after clear cope");
            //            System.out.println("main : " + list);
            //            System.out.println("cope : " + listBasedOnList);
            //            // clear same
            //            List<String> listBasedOnList = list;
            //            System.out.println("main : " + list);
            //            System.out.println("cope : " + listBasedOnList);
            //
            //            listBasedOnList.clear();
            //            System.out.println("after clear cope");
            //            System.out.println("main : " + list);
            //            System.out.println("cope : " + listBasedOnList);

            //            // sublist
            //            List<String> sublist = list.subList(1,4);
            //            System.out.println("main : " + list);
            //            System.out.println("sublist : " + sublist);
            //
            //            sublist.clear();
            //            System.out.println("after clear sublist");
            //            System.out.println("sublist : " + sublist);
            //            System.out.println("main : " + list);

            //            // sublist with constructor
            //            List<String> sublist = new ArrayList<>(list.subList(1,4));
            //            System.out.println("main : " + list);
            //            System.out.println("sublist : " + sublist);
            //
            //            sublist.clear();
            //            System.out.println("after clear sublist");
            //            System.out.println("sublist : " + sublist);
            //            System.out.println("main : " + list);

            //            // list contains all
            //            List<String> sublist = new ArrayList<>(list.subList(1,4));
            //            System.out.println("main : " + list);
            //            System.out.println("sublist : " + sublist);
            //
            //            System.out.println("contains all :" + list.containsAll(sublist));

            // list does not contains all
            //            List<String> sublist = new ArrayList<>(list.subList(1,4));
            ////            sublist.add("new value in sublist");
            //            System.out.println("main : " + list);
            //            System.out.println("sublist : " + sublist);
            //
            ////            System.out.println("contains all :" + list.containsAll(sublist));
            //            System.out.println("contains:" + list.contains(sublist));
//            List<String> sublist = new ArrayList<>(list.subList(1, 4));
//            System.out.println("main : " + list);
//            System.out.println("sublist : " + sublist);
//
//            list.remove("A");
//            System.out.println("main : " + list);

//            list.removeAll(sublist);
//            System.out.println("main : " + list);

            System.out.println(list);
            list.add("A");

            list.add("A");
            System.out.println(list);
            Collection<String> collection = Collections.singletonList("A");
//            list.removeAll(collection);
            System.out.println(list);
            list.removeIf(s -> s.equals("A"));
            System.out.println(list);

        } else {
            //            throw new NullPointerException("Value must not be null");
            throw new IllegalArgumentException("Value must not be null");
        }

    }
}
