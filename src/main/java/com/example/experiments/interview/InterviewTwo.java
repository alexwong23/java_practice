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
        this.name = name;
        this.age = age;
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
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
