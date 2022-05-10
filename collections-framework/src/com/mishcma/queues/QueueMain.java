package com.mishcma.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // FIFO - O(1)
        queue.add("Adam");
        queue.add("Kevin");
        queue.add("Kevin2");
        queue.add("Kevin3");

        System.out.println("Removed: " + queue.remove());

        for (String s : queue) {
            System.out.println(s);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
