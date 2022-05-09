package com.mishcma.homeworkexercise1;

public class HomeWorkExercise1Main {

    public static void main(String[] args) {
        Library<Algorithm> library = new Library<>();
        library.add(new SearchAlgorithm());
        library.add(new SortingAlgorithm());
        library.add(new GraphAlgorithm());

        Algorithm item = library.getLast();

        while (item != null) {
            item.execute();
            item = library.getLast();
        }
    }
}
