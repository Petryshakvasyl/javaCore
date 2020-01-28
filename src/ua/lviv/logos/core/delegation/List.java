package ua.lv.lgs.delegation;

import java.util.ArrayList;

public class List {

    private ArrayList list = new ArrayList();

    public void add(String s) {
        list.add(s);
    }

    public String get(int index) {
        return (String) list.get(index);
    }

}
