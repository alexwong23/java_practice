package com.example.experiments.interview.three;

import com.example.experiments.model.Employee;

import java.util.Comparator;


// TODO: problem statement 3
//     Given a collection of employees (id, name salary)
//     Get names of employees in ascending order based on age
public class EmployeeAgeCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
