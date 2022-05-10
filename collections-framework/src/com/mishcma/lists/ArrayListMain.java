package com.mishcma.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        // resizing the array takes 0(N)
        List<String> names = new ArrayList<>(500000000);

        names.add("Kevin");
        names.add("Max");
        names.add("Maksym");

        // random indexing in O(1)
        System.out.println(names.get(0));

        //insert item into a given index - O(N)
        names.add(0, "Daniel");
        names.remove(0);

        // contains in array O(N)
        System.out.println(names.contains("Adam"));

        Object[] o = names.toArray();

        for (Object obj :
            o) {
            System.out.println(obj);
        }

        // because of the Iterable
        for (String s : names) {
            System.out.println(s);
        }
    }
}
