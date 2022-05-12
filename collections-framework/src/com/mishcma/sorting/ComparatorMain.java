package com.mishcma.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Albert Camus1", "title1", 223));
        books.add(new Book("Z", "title2", 891));
        books.add(new Book("Albert Camus2", "title2", 891));
        books.add(new Book("Albert Camus3", "title3", 4));
        books.add(new Book("A", "title3", 4));

        Collections.sort(books, new BookComparator().reversed());
        Collections.sort(books, new BookComparator());

        System.out.println(books);
    }
}
