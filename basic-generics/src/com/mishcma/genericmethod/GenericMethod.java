package com.mishcma.genericmethod;

public class GenericMethod {

    // Generic method void
    public <T> void showItem(T item) {
        System.out.println("The item is: " + item);
    }

    // Generic method with return type
    public <T> T showItemWithReturn(T item) {
        System.out.println("The item is: " + item);
        return item;
    }

    // Generic method with multiple variables
    public <T, V> void printItems(T t, V v) {
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    // Genetic method with array
    public <T> void showItems(T[] items) {
        for (T t : items) {
            System.out.println(t);
        }
    }
}
