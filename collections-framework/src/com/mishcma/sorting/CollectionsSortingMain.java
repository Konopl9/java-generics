package com.mishcma.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortingMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Joe");

        // we can specify  reverse order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }

}
