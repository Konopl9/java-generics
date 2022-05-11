package com.mishcma.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // insert into the map O(1) if there is no collision
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(3, "Ana");
        map.put(40, "Maksym");
        map.put(null, "Key Null");

        // remove items in O(1)
        map.remove(2);

        // we can retrieve items based on key O(1)
        System.out.println(map.get(1));
        System.out.println(map.get(null));

        System.out.println("For each====");
        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // =================================== hashCode
        Map<String, Person> hasCode = new HashMap<>();
        hasCode.put("Adam", new Person("Maksym", 15));

    }
}
