//package com.example.experiments.interview.two;
//
//import java.util.Objects;
//
//public class Person {
//    private String name;
//    private Integer age;
//
//    public Person() {}
//    public Person(String name, int age) {
//        // NOTE: call set methods to throw error, not sure if good practice
//        this.setName(name);
//        this.setAge(age);
//    }
//
//    // NOTE: all objects have these two methods: equals() and hashCode()
//
//    // NOTE:
//    //  1. argument is an object!
//    //  2. by default, compares object reference
//    //  3. compares values of object
//    @Override
//    public boolean equals(Object o) {
//        // TODO:
//
//    }
//
//    // NOTE:
//    //  1. returns integer hashcode value of given object
//    //  2. returns same hash value when two objects are equal according to method equal()
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    public String getName() {
//        return this.name;
//    }
//    public int getAge() {
//        return this.age;
//    }
//    public void setName(String name) {
//        // TODO:
//        if( ) throw new IllegalArgumentException("Error: Person name cannot be null");
//        this.name = name;
//    }
//    public void setAge(int age) {
//        // TODO:
//        if() throw new IllegalArgumentException("Error: Person age must be positive");
//        else if() throw new IllegalArgumentException("Error: Person age cannot be zero");
//        else if() throw new IllegalArgumentException("Error: Person cannot be above 100 years old");
//        this.age = age;
//    }
//}
