package com.mishcma.wildcards.upperbounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardsMain {

    public static double sumAll(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void showAll(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        // we can create ArrayList like this
        List<? extends Number> list = new ArrayList<Integer>();
        List<? extends Number> list1 = new ArrayList<Double>();
        List<? extends Number> list2 = new ArrayList<Float>();

        // we use upper bounded wildcards to read the items
        showAll(list);
        showAll(Arrays.asList(1.2f, 2.3f, 3.4f));
        System.out.println(sumAll(Arrays.asList(1.2f, 2.3f, 3.4f)));
    }

}
