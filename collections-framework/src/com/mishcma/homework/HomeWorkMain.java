package com.mishcma.homework;

public class HomeWorkMain {

    public static void main(String[] args) {
        Cache cache = new Cache();

        cache.search("www.facebook.com");
        cache.search("www.g1.com");
        cache.search("www.g2.com");
        cache.search("www.g3.com");
        cache.search("www.g1.com");
        cache.search("www.g5.com");

        cache.showCache();
    }
}
