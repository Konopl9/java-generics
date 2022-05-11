package com.mishcma.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {
        // O(logN)
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(12);
        set.add(1);
        set.add(3);
        set.add(9);
        set.add(4);
        set.add(1232);
        set.add(123);
        set.add(122);
        set.add(11112);

        for (Integer i :
            set) {
            System.out.println(i);
        }

        Set<Integer> subSet = set.subSet(0, 100);
        System.out.println("Subset:");
        for (Integer i :
            subSet) {
            System.out.println(i);
        }

        subSet = set.tailSet(300);
        System.out.println("TailSet:");
        for (Integer i :
            subSet) {
            System.out.println(i);
        }
        subSet = set.headSet(300);
        System.out.println("HadSet:");
        for (Integer i :
            subSet) {
            System.out.println(i);
        }

    }
}
