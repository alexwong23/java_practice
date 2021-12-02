//package com.example.experiments.collection.list;
//import com.example.experiments.model.Employee;
//import com.example.experiments.model.FirstLastNameCompare;
//import com.example.experiments.model.SalaryCompare;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class ArrayListTest {
//
//    public static Logger log = LoggerFactory.getLogger(Employee.class);
//    private List<Employee> employees = new ArrayList<>();
//    private static List<Employee> finalEmployees;
//    private static Employee derian, shat, james, jamesw;
//
//    @BeforeAll() // executes once and before BeforeEach
//    public static void InitialSetup () {
//        derian = new Employee("Derian", "Tan", 26, 15500.23);
//        shat = new Employee("Shatyam", "Thee", 24, 9988.23);
//        james = new Employee("James", "Soh", 24, 10000.99);
//        jamesw = new Employee("James", "Bond", 19, 0.0);
//        // TODO: initialise finalEmployees list with order - shat, james, derian, jamesw
//        finalEmployees =
//    }
//
//    @BeforeEach()
//    public void Setup() {
//        // TODO: use addAll() to add finalEmployees into employees List
//
//    }
//
//    @AfterEach()
//    public void Breakdown() {
//        employees.clear();
//    }
//
//    // NOTE: Printing array of primitives vs objects
//    //  Array of primitives - Array.toString()
//    //  Array of objects - String.valueOf() and override toString()
//    @Test
//    public void TestDifferentPrint_ShouldPass() {
//        int[] integerArray = new int[] { 4, 3, 7, 0, 1 };
//        List<Integer> integerArrayList = new ArrayList<Integer>( List.of(4, 3, 7, 0, 1) );
//        // TODO: get integerArray String
//        assertEquals("[4, 3, 7, 0, 1]", );
//        // TODO: get integerArrayList String
//        assertEquals("[4, 3, 7, 0, 1]", );
//    }
//
//    @Test
//    public void TestEmployeeEquals_ShouldFail() {
//        Employee jamme = new Employee("Jamme", "Soh", 24, 10000.99);
//        // TODO: use contains() to check if employee List has Jamme
//        assertFalse( );
//    }
//
//    @Test
//    public void TestEmployeeEquals_ShouldPass() {
//        // TODO: use get() and equals() to retrieve james
//        assertTrue( james );
//    }
//
//    @Test
//    public void TestEmployeeGet_ShouldPass() {
//        // TODO: use get() to retrieve derian
//        assertEquals( derian );
//    }
//
//    @Test
//    public void TestEmployeeSet_ShouldPass() {
//        Employee mo = new Employee("Mohammed", "Salah", 28, 21000.99);
//        // TODO: use set() to replace second employee with Mo
//
//        assertEquals(employees.size(), 4);
//        assertTrue(employees.get(1).equals(mo));
//    }
//
//    @Test
//    public void TestEmployeeAdd_ShouldPass() {
//        Employee mo = new Employee("Mohammed", "Salah", 28, 21000.99);
//        // TODO: add Mo to employees List
//
//        assertEquals(employees.size(), 5);
//        assertTrue(employees.contains(mo));
//    }
//
//    @Test
//    public void TestEmployeeRemove_ShouldPass() {
//        // TODO: remove derian from employees List
//
//        assertEquals(employees.size(), 3);
//        assertEquals(jamesw, employees.get(2));
//        assertFalse(employees.contains(derian));
//    }
//
//    // NOTE: contains && indexOf
//    @Test
//    public void TestEmployeeContainsAndIndexOf_ShouldPass() {
//        // TODO: check if jamesw is an employee
//        assertTrue( jamesw );
//        // TODO: how to find index of jamesw in the list
//        assertEquals(3, );
//    }
//
//    @Test
//    public void TestEmployeeSortByAgeLambda_ShouldPass() {
//        // TODO: use a lambda expression to sort by age DESCENDING
//        //  * return an int *
//        Collections.sort(employees, ( , ) ->
//            (int)
//        );
//        assertEquals(List.of(derian, shat, james, jamesw), employees);
//    }
//
//    @Test
//    public void TestEmployeeSortAgeNameAsc_ShouldPass() {
//        // TODO: sort by Object's compareTo() method
//
//        assertEquals(List.of(jamesw, james, shat, derian), employees);
//    }
//
//    // NOTE: Multiple comparators
//    @Test
//    public void TestEmployeeSortFirstLastNameAsc_ShouldPass() {
//        // sort by two fields first name and last name
//        // TODO: complete comparator FirstLastNameCompare
//
//        Collections.sort(employees, firstLastNameCompare);
//        assertEquals(List.of(derian, jamesw, james, shat), employees);
//    }
//
//    @Test
//    public void TestEmployeeSortSalaryAsc_ShouldPass() {
//        // TODO: complete comparator SalaryCompare
//
//        Collections.sort(employees, salaryCompare);
//        assertEquals(List.of(jamesw, shat, james, derian), employees);
//    }
//
//    @Test // NOTE: BucketSort Challenge
//    public void TestEmployeeBucketSortSalaryAsc_ShouldPass() {
//
//    }
//}
//
//
//
//
//
//
