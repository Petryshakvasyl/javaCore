package ua.lviv.logos.core;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User user, User t1) {
        return user.getAge() - t1.getAge();
    }
}
