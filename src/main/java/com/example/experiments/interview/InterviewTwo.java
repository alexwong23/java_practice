package com.example.experiments.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InterviewTwo {

    //    TODO:
    //        1. Create an arraylist of person objects
    //        2. Insert person into arraylist
    //        3. Find anyone above 18 years of age
    //        4. Print name and age and total count
    //        5. Write test cases
}

class Person {
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
        // NOTE: call set methods to throw error
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
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
