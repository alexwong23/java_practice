package com.example.experiments.answers.collection.list;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private List<Employee> employees = new ArrayList<>();
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

    @BeforeEach()
    public void Setup() {
        employees.addAll(finalEmployees);
    }

    @AfterEach()
    public void Breakdown() {
        employees.clear();
    }

    @Test
    public void TestEmployeeGet_ShouldPass() {
        Iterator<Employee> it = employees.iterator();
        assertEquals(shat, it.next()); // first element
        assertEquals(james, it.next());
        assertEquals(derian, it.next());
        assertEquals(jamesw, it.next());
    }

    @Test
    public void TestEmployeeLoop_ShouldPass() {
        Iterator<Employee> it = employees.iterator();
        int counter = 0;
        while(it.hasNext()) {
            assertEquals(employees.get(counter), it.next());
            counter++;
        }
    }

    @Test
    public void TestEmployeeRemove_ShouldPass() {
        Iterator<Employee> it = employees.iterator();
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
        assertEquals(employees.size(), 0);
        assertEquals("[]", employees.toString());
    }
}
