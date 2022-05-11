package com.mishcma.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        // initial capacity 16
        // hashcode function is going to transform input into array index
        // O(1) + memory heavy
        // there collisions can happen
        Set<String> set = new HashSet<>();

        set.add("Adam");
        set.add("Mary");
        set.add("Ketty");
        set.add("Ana");

        System.out.println("First set");
        for (String s : set) {
            System.out.println(s);
        }

        Set<String> set1 = new HashSet<>();

        set1.add("Adam");
        set1.add("Ana");

        System.out.println("Second set");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("Retain all example");
        set.retainAll(set1);

        for (String s :
            set1) {
            System.out.println(s);
        }
    }
}
