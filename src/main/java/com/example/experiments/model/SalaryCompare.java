package com.example.experiments.model;

import java.util.Comparator;

public class SalaryCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return (int) Math.round(e1.getSalary() - e2.getSalary()); // math.round returns long
    }
}
