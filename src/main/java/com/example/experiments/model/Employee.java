package com.example.experiments.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>, Serializable {

    private String firstName;
    private String lastName;
    private Integer age;
    transient private Double salary;

    public Employee(String firstName, String lastName, Integer age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // TODO: override the equals method, returns boolean
    //  if conditions - check if same reference using ==
    //  if conditions - object must be not be null and have same class
    //  equality - all fields must be equal


    // TODO: override the hashCode method, returns int
    //  Objects.hash(all fields)


    // TODO: override compareTo method, returns int
    //  sort by two fields age ASC and firstName ASC


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

// Create multiple comparators
// 1. FirstLastNameCompare
// 2. SalaryCompare
