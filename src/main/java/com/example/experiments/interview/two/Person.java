package com.example.experiments.interview.two;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
        // NOTE: call set methods to throw error
        this.setName(name);
        this.setAge(age);
    }

    // NOTE: all objects have these two methods: equals() and hashCode()

    // NOTE:
    //  1. argument is an object!
    //  2. by default, compares object reference
    //  3. compares values of object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // NOTE:
    //  1. returns integer hashcode value of given object
    //  2. returns same hash value when two objects are equal according to method equal()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        if(name == null) throw new IllegalArgumentException("Error: Person name cannot be null");
        this.name = name;
    }
    public void setAge(int age) {
        if(age < 0) throw new IllegalArgumentException("Error: Person age must be positive");
        else if(age == 0) throw new IllegalArgumentException("Error: Person age cannot be zero");
        else if(age > 100) throw new IllegalArgumentException("Error: Person cannot be above 100 years old");
        this.age = age;
    }
}
