package com.mishcma.sorting;

import java.util.Arrays;

public class ArraysSortingMain {

    public static void main(String[] args) {
        // QuickSort to sort primitive types (int, float, etc.)
        // MergeSort - to sort reference types (Integer, String ... )

        int[] nums = {1, 10, 5, 2, -5, 12, 14};
        String[] names = {"Max", "Max2", "Max3", "Max4", "Max5"};
        Arrays.sort(nums);
        Arrays.sort(names);

        for (String n :
            names) {
            System.out.print(n + " ");
        }

        for (int n :
            nums) {
            System.out.print("\n" + n + " ");
        }
    }

}
