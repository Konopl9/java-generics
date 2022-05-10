package com.mishcma.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {

    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>();

        queue.add(new Person("Kevin", 22));
        queue.add(new Person("Kevin1", 37));
        queue.add(new Person("Kevin2", 12));
        queue.add(new Person("Kevin3", 45));

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
