package com.mishcma.lists;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Adam");
        stack.push("Adam2");
        stack.push("Adam1");
        stack.push("Kailey");
        stack.push("ALena");

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
