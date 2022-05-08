package com.mishcma.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardsMain {

    public static <T extends Shape> void drawAll(List<T> shapes) {
        for (T shape : shapes) {
            shape.draw();
        }
    }

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("Max", "Masha", "Joe");
        print(nums);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        drawAll(rectangles);
    }

}
