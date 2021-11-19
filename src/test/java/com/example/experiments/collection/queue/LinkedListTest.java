package com.example.experiments.collection.queue;

import com.example.experiments.model.Employee;
import com.example.experiments.model.FirstLastNameCompare;
import com.example.experiments.model.SalaryCompare;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private LinkedList<Employee> employees = new LinkedList<>();
    private static List<Employee> finalEmployees;
    private static Employee derian, shat, james, jamesw;

    @BeforeAll() // executes once and before BeforeEach
    public static void InitialSetup () {
        derian = new Employee("Derian", "Tan", 26, 15500.23);
        shat = new Employee("Shatyam", "Thee", 24, 9988.23);
        james = new Employee("James", "Soh", 24, 10000.99);
        jamesw = new Employee("James", "Bond", 19, 0.0);
        finalEmployees = new ArrayList<>(
                List.of(shat, james, derian, jamesw) // initialise with elements
        );
    }

    @BeforeEach
    public void Setup() {
        employees.addAll(finalEmployees);
    }

    @AfterEach
    public void Breakdown() {
        employees.clear();
    }

    @Test
    public void TestEmployeeAdd_ShouldPass() {
        Employee mo = new Employee("Mohammed", "Salah", 28, 21000.99);
        employees.add(mo);
        assertEquals(employees.size(), 5);
        assertTrue(employees.contains(mo));
    }

    @Test
    public void TestEmployeeRemove_ShouldPass() {
        employees.remove(2);
        assertEquals(employees.size(), 3);
        assertEquals(jamesw, employees.get(2));
        assertFalse(employees.contains(derian));
    }

    @Test
    public void TestEmployeeContainsAndIndexOf_ShouldPass() {
        assertTrue(employees.contains(jamesw));
        assertEquals(3, employees.indexOf(jamesw));
    }

    //TODO: act as a queue?
    // getfirst
    // getlast
    // push
    // pop

}
