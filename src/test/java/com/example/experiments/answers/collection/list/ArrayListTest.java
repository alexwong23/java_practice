package com.example.experiments.answers.collection.list;

import com.example.experiments.model.Employee;
import com.example.experiments.model.FirstLastNameCompare;
import com.example.experiments.model.SalaryCompare;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

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

    // NOTE: Printing array of primitives vs objects
    //  Array of primitives - Array.toString()
    //  Array of objects - String.valueOf() and override toString()
    @Test
    public void TestDifferentPrint_ShouldPass() {
        int[] integerArray = new int[] { 4, 3, 7, 0, 1 };
        List<Integer> integerArrayList = new ArrayList<Integer>( List.of(4, 3, 7, 0, 1) );
        assertEquals("[4, 3, 7, 0, 1]", Arrays.toString(integerArray));
        assertEquals("[4, 3, 7, 0, 1]", String.valueOf(integerArrayList));
        assertEquals(String.valueOf(finalEmployees), "[Employee{firstName='Shatyam', lastName='Thee', age=24, salary=9988.23}, Employee{firstName='James', lastName='Soh', age=24, salary=10000.99}, Employee{firstName='Derian', lastName='Tan', age=26, salary=15500.23}, Employee{firstName='James', lastName='Bond', age=19, salary=0.0}]");
    }

    @Test
    public void TestEmployeeEquals_ShouldFail() {
        Employee jamme = new Employee("Jamme", "Soh", 24, 10000.99);
        assertFalse(employees.contains(jamme));
    }

    @Test
    public void TestEmployeeEquals_ShouldPass() {
        assertTrue(employees.get(1).equals(james));
    }

    @Test
    public void TestEmployeeGet_ShouldPass() {
        assertEquals(employees.get(2), derian);
    }

    @Test
    public void TestEmployeeSet_ShouldPass() {
        Employee mo = new Employee("Mohammed", "Salah", 28, 21000.99);
        employees.set(1, mo);
        assertEquals(employees.size(), 4);
        assertTrue(employees.get(1).equals(mo));
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

    // NOTE: contains && indexOf
    @Test
    public void TestEmployeeContainsAndIndexOf_ShouldPass() {
        assertTrue(employees.contains(jamesw));
        assertEquals(3, employees.indexOf(jamesw));
    }

    @Test
    public void TestEmployeeSortByAgeLambda_ShouldPass() {
        Collections.sort(employees, (o1, o2) ->
            (int) o2.getAge() - o1.getAge()
        );
        assertEquals(List.of(derian, shat, james, jamesw), employees);
    }

    @Test
    public void TestEmployeeSortAgeNameAsc_ShouldPass() {
        Collections.sort(employees);
        assertEquals(List.of(jamesw, james, shat, derian), employees);
    }

    // NOTE: Multiple comparators
    @Test
    public void TestEmployeeSortFirstLastNameAsc_ShouldPass() {
        // sort by two fields first name and last name
        FirstLastNameCompare firstLastNameCompare = new FirstLastNameCompare();
        Collections.sort(employees, firstLastNameCompare);
        assertEquals(List.of(derian, jamesw, james, shat), employees);
    }

    @Test
    public void TestEmployeeSortSalaryAsc_ShouldPass() {
        SalaryCompare salaryCompare = new SalaryCompare();
        Collections.sort(employees, salaryCompare);
        assertEquals(List.of(jamesw, shat, james, derian), employees);
    }

    @Test // NOTE: BucketSort Challenge
    public void TestEmployeeBucketSortSalaryAsc_ShouldPass() {

    }

}
