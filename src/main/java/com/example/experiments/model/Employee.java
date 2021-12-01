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

    // NOTE:
    //  1. argument is an object!
    //  2. by default, compares object reference
    //  3. compares values of object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                age.equals(employee.age) &&
                salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary);
    }

    // sort by two fields age and then first name
    public int compareTo(Employee e) {
        int diff = this.age - e.age;
        if(diff != 0) return diff;
        return this.getFirstName().compareTo(e.getFirstName());
    }

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
