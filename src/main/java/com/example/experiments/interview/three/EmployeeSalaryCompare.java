package com.example.experiments.interview.three;

import com.example.experiments.model.Employee;

import java.util.Comparator;

// TODO: problem statement 3
//     Given a collection of employees (id, name salary)
//     Get names of employees in ascending order based on salary
public class EmployeeSalaryCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
    }
}
