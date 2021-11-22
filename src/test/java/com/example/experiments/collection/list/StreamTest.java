package com.example.experiments.collection.list;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class StreamTest {

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
        // TODO: initialise finalEmployees list with order - shat, james, derian, jamesw
        finalEmployees =
    }

    @BeforeEach()
    public void Setup() {
        // TODO: use addAll() to add finalEmployees into employees List

    }

    @AfterEach()
    public void Breakdown() {
        employees.clear();
    }

    @Test
    public void TestEmployeeCount_ShouldPass() {
        // TODO: use stream to get count
        assertEquals(, 4);
    }

    @Test
    public void TestEmployeeContains_ShouldPass() {
        // TODO: use stream to check if contains * use method anyMatch() *
        //  check if there is an employee with first name 'Alex'
        //  check if there is an employee with first name 'James'
        assertFalse((employees.stream(). );
        assertTrue((employees.stream(). );
    }

    @Test
    public void TestEmployeeFindJamesBond_ShouldPass() {
        // TODO: use stream to filter  * use method anyMatch() *
        List<Employee> jamess = employees.stream()
                        .filter(x -> x.getFirstName().equals("James"))
                        .collect(Collectors.toList());
        assertTrue(jamess.equals(List.of(james, jamesw)));
    }

    @Test
    public void TestEmployeeMaxMinOptional_ShouldPass() {
        Optional<Employee> rich = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> poor = employees.stream()
                .min(Comparator.comparing(Employee::getSalary));
        assertEquals(rich.get(), derian);
        assertEquals(poor.get(), jamesw);
    }

    @Test
    public void TestEmployeeFilter_ShouldPass() {
        List<Employee> foundEmployees = employees.stream()
                .filter(x -> x.getFirstName().equals("James"))
                .collect(Collectors.toList());
        assertEquals(foundEmployees, List.of(james, jamesw));
    }

    @Test
    public void TestEmployeeLimitFirstTwo_ShouldPass() {
        List<Employee> firstTwo = employees.stream()
                .limit(2)
                .collect(Collectors.toList());
        assertEquals(firstTwo, List.of(shat, james));
    }

    @Test
    public void TestEmployeeDistinct_ShouldPass() {
        List<String> alphabets = new ArrayList<String>(
                List.of("A", "A", "B", "D", "B", "C", "D")
        );
        List<String> distinct = alphabets.stream()
                .distinct()
                .collect(Collectors.toList());
        assertEquals(distinct.toString(), "[A, B, D, C]");
    }

    @Test
    public void TestEmployeeFullnameUppercaseUsingForEachAndMap_ShouldPass() {
        employees.forEach(f -> {
            f.setFirstName(f.getFirstName().toUpperCase());
            f.setLastName(f.getLastName().toUpperCase());
        });
        List<String> firstNames = employees.stream()
                .map(x -> x.getFirstName() + " " + x.getLastName())
                .collect(Collectors.toList());
        assertEquals(firstNames.toString(), "[SHATYAM THEE, JAMES SOH, DERIAN TAN, JAMES BOND]");
    }

    @Test
    public void TestEmployeeAddMultiplyUsingReduce_ShouldPass() {
        List<Integer> integers = new ArrayList<Integer>(List.of(2, 3, 4, 5));
        Integer totalSum = integers.stream()
                .reduce(0, (partial, number) -> partial + number);
        Integer totalMultiply = integers.stream()
                .reduce(1, (partial, number) -> partial * number);
        assertEquals(totalSum, 14);
        assertEquals(totalMultiply, 120);
    }

    @Test
    public void TestEmployeeSortFirstNameAsc_ShouldPass() {
        Comparator<Employee> compareByFirstName = Comparator
                .comparing(Employee::getFirstName);
        List<Employee> sortedEmployees = employees.stream()
                .sorted(compareByFirstName)
                .collect(Collectors.toList());
        assertEquals(List.of(derian, james, jamesw, shat), sortedEmployees);
    }

    @Test
    public void TestEmployeeSortFirstLastNameAsc_ShouldPass() {
        Comparator<Employee> compareByName = Comparator
                .comparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);
        List<Employee> sortedEmployees = employees.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());
        assertEquals(List.of(derian, jamesw, james, shat), sortedEmployees);
    }

    @Test
    public void TestEmployeeParallelForEachOrdered_ShouldPass() {
        List<Double> salariesParallel = new ArrayList<Double>();
        employees.parallelStream()
                .forEachOrdered(x -> salariesParallel.add(x.getSalary()));
        assertEquals(salariesParallel.toString(), "[9988.23, 10000.99, 15500.23, 0.0]");
    }
}
