package com.mishcma.homeworkexercise1;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithm> {

    private final List<T> algorithms;

    public Library() {
        this.algorithms = new ArrayList<>();
    }

    public void add(T algorithm) {
        this.algorithms.add(algorithm);
    }

    public T getLast() {
        if (algorithms.size() <= 0) {
            return null;
        }

        T actualItem = algorithms.remove(algorithms.size() - 1);
        return actualItem;
    }
}
