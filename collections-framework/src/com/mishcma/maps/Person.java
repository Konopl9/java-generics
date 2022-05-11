package com.mishcma.maps;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // because in a hashmap it may happen (collisions)
    // that we have to find the item (Person) in a linked list
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // hasCode = has-function
    // it calculates an array index based on the key (keys== Person object)
    // avoid clustering with prime numbers
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // There SOME RULES
    // 1. If two objects are equal than they must have the same hash code
    // 2. If two objects have the same hash code they may not be equal

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
