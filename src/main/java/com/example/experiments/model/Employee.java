package com.example.experiments.model;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

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

    // TODO: what else do I have to understand about equals method
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

    // TODO: what is hashcode used for?
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary);
    }

    // TODO: how to create multiple comparators

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
