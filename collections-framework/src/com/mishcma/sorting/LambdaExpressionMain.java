package com.mishcma.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionMain {

    public static void main(String[] args) {
        // Lambda
        List<Person> people = new ArrayList<>();

        people.add(new Person("Adam", 33));
        people.add(new Person("Joe", 32));
        people.add(new Person("Michel", 10));
        people.add(new Person("Ana", 61));
        people.add(new Person("Katy", 12));
        people.add(new Person("Kavin", 32));
        people.add(new Person("Joe2", 21));

        Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());

        for (Person p :
            people) {
            System.out.println(p.getName() + "-" + p.getAge());
        }
    }
}
