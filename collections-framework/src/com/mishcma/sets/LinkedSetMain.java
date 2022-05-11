package com.mishcma.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetMain {

    public static void main(String[] args) {
        // preserve the order of the insertion
        // doubly linked list connecting tge items
        // It needs more memory than hashsets
        Set<String> set = new LinkedHashSet<>();

        set.add("Adam");
        set.add("Adam1");
        set.add("Adam2");
        set.add("Adam3");
        set.add("Adam4");

        for (String s :
            set) {
            System.out.println(s);
        }

    }
}
