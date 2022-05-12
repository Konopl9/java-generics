package com.mishcma.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceMain {

    public static void main(String[] args) {
        List<BookComparable> books = new ArrayList<>();

        books.add(new BookComparable("Albert Camus1", "title1", 223));
        books.add(new BookComparable("Z", "title2", 891));
        books.add(new BookComparable("Albert Camus2", "title2", 891));
        books.add(new BookComparable("Albert Camus3", "title3", 4));
        books.add(new BookComparable("A", "title3", 4));

        Collections.sort(books);

        System.out.println(books);
    }
}
