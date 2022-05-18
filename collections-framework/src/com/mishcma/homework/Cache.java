package com.mishcma.homework;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private static final int CAPACITY = 5;
    private final List<Pair> cache;

    public Cache() {
        this.cache = new ArrayList<>();
    }

    public void search(String url) {
        Pair searchedItem = null;

        // we check if a given url is alearedy searched for
        for (Pair pair : cache)
            if (pair.getUrl().equals(url))
                searchedItem = pair;


            if (searchedItem != null) {
                // update the cache
                cache.remove(searchedItem);
                cache.add(0, searchedItem);
            } else {
                // url is not present  in the test
                Pair newPair = new Pair(url, "random content");

                if (cache.size() >= CAPACITY) {
                    cache.remove(CAPACITY - 1);
                }

                if (cache.size() == 0) {
                    cache.add(newPair);
                } else {
                    cache.add(0, newPair);
                }
            }

    }

    public void showCache() {
        for (Pair pair : cache) {
            System.out.println(pair);
        }
    }

}
