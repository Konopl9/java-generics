package com.mishcma.boundedtype;

public class BoundedTypeMain {

    public static <T extends Comparable<T>> T calculate(T num1, T num2) {
        if (num1.compareTo(num2) < 0) {
            return num1;
        }
        return num2;
    }

    // Exercise
    public static <T extends Number> double add(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(23, 54));
        System.out.println(calculate("F", "B"));
        System.out.println(calculate(new Person(23, "Max"), new Person(25, "Masha")));
        // Exercise
        System.out.println(add(5.0002, 20));
    }

}
