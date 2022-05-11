package com.mishcma.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "ten");
        map.put(3, "three");
        map.put(1, "one");
        map.put(5, "five");
        map.put(6, "six");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Largest value: " + map.lastKey());
        System.out.println("Smallest value: " + map.firstEntry());

        Map<Integer, String> mapReverse = new TreeMap<>(Comparator.reverseOrder());

        mapReverse.put(10, "ten");
        mapReverse.put(3, "three");
        mapReverse.put(1, "one");
        mapReverse.put(5, "five");
        mapReverse.put(6, "six");

        for (Map.Entry<Integer, String> entry : mapReverse.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // ===== COMPARE TREE MAP AND HASH MAP PERFORMANCE ========
        // O(logN)
        Map<Integer, Integer> treeMap = new TreeMap<>();

        long now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            treeMap.put(i, i);
        }

        for (int i = 0; i < 500000; i++) {
            map.get(i);
        }

        System.out.println("Time taken with TreeMap: " + (System.currentTimeMillis() - now));

        // O(1)
        Map<Integer, Integer> hashMap = new HashMap<>();

        now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            hashMap.put(i, i);
        }

        for (int i = 0; i < 500000; i++) {
            hashMap.get(i);
        }

        System.out.println("Time taken with HashMap: " + (System.currentTimeMillis() - now));
    }
}
