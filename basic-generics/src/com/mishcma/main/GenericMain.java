package com.mishcma.main;

import com.mishcma.HashTable;
import com.mishcma.Store;

public class GenericMain {

    public static void main(String[] args) {
        // Generic type
        Store<String> store = new Store<>();
        store.setItem("Hello");
        String item = store.getItem();
        System.out.println(item);

        // Generic type with multiple data type
        HashTable hashTAble = new HashTable("Hello", 23.5);
        HashTable<String, Integer> hashTable1 = new HashTable("Hello", 23);
        System.out.println(hashTable1);
        System.out.println(hashTAble);
    }
}




