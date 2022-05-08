package com.mishcma.generictype;

public class HashTable<K, V> {

    private final K key;
    private final V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Hashtable [key=" + key + ", value=" + value + "]";
    }
}
