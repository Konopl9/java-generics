package com.mishcma.wildcards.lowerbounded;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcardsMain {

    public static void showAll(List<? super Number> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }

    // Exercise
    public static <T> void copy(List<? extends T> sourceList,
        List<? super T> destinationList) {
        for (int i = 0; i < sourceList.size(); i++) {
            destinationList.add(sourceList.get(i));
        }
    }

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Integer>();
        List<? super Integer> list1 = new ArrayList<Number>();
        List<? super Integer> list2 = new ArrayList<Object>();

        // how to read items using lower bounded wildcards
        List<Serializable> list3 = new ArrayList<>();
        list3.add("Adam");
        list3.add("Adam");
        list3.add("Adam");
        showAll(list3);

        // insert item
        List<? super Number> nums = new ArrayList<>();
        nums.add(3);
        nums.add(3.5);
        nums.add(3.5f);

        // exercise
        List<Integer> original = new ArrayList<>();
        List<Number> toCopy = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        copy(original, toCopy);
        System.out.println(original);
        System.out.println(toCopy);

        List<String> list4 = Arrays.asList("Adam", "Ana", "Kevin");
        List<String> list5 = new ArrayList<>();
        copy(list4, list5);
        System.out.println(list5);

    }
}
