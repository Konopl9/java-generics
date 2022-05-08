package com.mishcma.genericmethod;

public class GenericMethodMain {

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        // Generic method void
        genericMethod.showItem("Hello");

        // Generic method with return type
        System.out.println(genericMethod.showItemWithReturn("Hello"));

        // Generic method with multiple variables
        genericMethod.printItems("Adam", 3);

        // Genetic method with array
        Integer[] nums = {1, 2, 3, 4, 5};
        String[] names = {"Max", "Max1", "Max2", "Max3", "Max4"};
        genericMethod.showItems(nums);
        genericMethod.showItems(names);
    }
}
