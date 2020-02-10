package ua.lviv.logos.core.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ListUtils {

    public static List<String> createArrayList() {
        List<String> result = new ArrayList<>();
        fillListWithDefaultValues(result);
        return result;
    }

    public static List<String> createLinkedList() {
        List<String> result = new LinkedList<>();
        fillListWithDefaultValues(result);
        return result;
    }

    private static void fillListWithDefaultValues(List<String> result) {
        result.add("A");
        result.add("B");
        result.add("C");
        result.add("D");
        result.add("E");
        result.add("F");
    }
}

