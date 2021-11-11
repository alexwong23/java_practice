package com.example.experiments.collections;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    private List<Employee> employees;

    @BeforeEach()
    public void Setup() {
        Employee james = new Employee("James", "Soh", 24, 10000.99);
        Employee derian = new Employee("Derian", "Tan", 26, 15500.23);
        Employee shat = new Employee("Shatyam", "Thee", 24, 9988.23);
        employees = new ArrayList<>();
    }

    @Test
    public void TestGetEmployee() {
//        assertEqual("Shatyam", employees.get(2).getFirstName());
    }

    @Test
    public void TestEmployeeEquals() {

    }
}
