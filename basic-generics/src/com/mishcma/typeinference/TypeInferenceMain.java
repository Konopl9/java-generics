package com.mishcma.typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceMain {

    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list..");
    }

    public static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();
        TypeInferenceMain.addStore("Maksym", list);

        // type witness
        TypeInferenceMain.addStore("Daniel", list);

        // Type inference helps compiler to specify which type is expected to store in the list
        List<Integer> list1 = add(new ArrayList<>(), 20, 30);
        List<String> list2 = add(new ArrayList<>(), "Max", "Daniel");
        System.out.println(list1);
        System.out.println(list2);
    }
}

