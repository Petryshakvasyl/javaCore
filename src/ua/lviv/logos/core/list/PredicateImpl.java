package ua.lviv.logos.core.list;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.equals("A");
    }
}
