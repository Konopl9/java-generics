package com.mishcma.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(11);

        for (Integer num : list) {
            System.out.println(num);
        }

        // Usually we use linked list (MORE MEMORY !!!)
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);

        // TEST
        ArrayList<Integer> arrayList = new ArrayList<>();

        long now = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        System.out.println("Time taken for ArrayList: " + (System.currentTimeMillis() - now));

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        now = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList1.addFirst(i);
        }

        System.out.println("Time taken for LinkedList: " + (System.currentTimeMillis() - now));

        // CONCLUSION: Linked List has better performance if we need to insert the value at first
        // position because it requires only reference update without shifting with O(N)

    }
}
