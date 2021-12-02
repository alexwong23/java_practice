//package com.example.experiments.collection.list;
//
//import com.example.experiments.model.Employee;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StreamTest {
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
//    @Test
//    public void TestEmployeeCount_ShouldPass() {
//        // TODO: use stream to get count
//        assertEquals(, 4);
//    }
//
//    @Test
//    public void TestEmployeeContains_ShouldPass() {
//        // TODO: use stream to check if contains * use method anyMatch() *
//        //  check if there is an employee with first name 'Alex'
//        //  check if there is an employee with first name 'James'
//        assertFalse((employees.stream(). );
//        assertTrue((employees.stream(). );
//    }
//
//    @Test
//    public void TestEmployeeFindAllJames_ShouldPass() {
//        List<Employee> allJames = employees.stream()
//                .filter(x -> x.getFirstName().equals("James"))
//                .collect(Collectors.toList());
//        assertTrue(allJames.equals(List.of(james, jamesw)));
//    }
//
//    @Test
//    public void TestEmployeeMaxMinOptional_ShouldPass() {
//        // TODO: use stream max() to find employee with the highest salary
//        //  * use Comparator.comparing( :: ) * google the answer if needed
//        Optional<Employee> rich = employees.stream();
//        // TODO: use stream min() to find employee with the lowest salary
//        Optional<Employee> poor = employees.stream();
//        assertEquals(rich.get(), derian);
//        assertEquals(poor.get(), jamesw);
//    }
//
//    @Test
//    public void TestEmployeeFilter_ShouldPass() {
//        // TODO: use stream filter to return employees with firstName 'James'
//        List<Employee> foundEmployees =
//        assertEquals(foundEmployees, List.of(james, jamesw));
//    }
//
//    @Test
//    public void TestEmployeeLimitFirstTwo_ShouldPass() {
//        // TODO: use stream limit to return the first two employees
//        List<Employee> firstTwo =
//        assertEquals(firstTwo, List.of(shat, james));
//    }
//
//    @Test
//    public void TestEmployeeDistinct_ShouldPass() {
//        List<String> alphabets = new ArrayList<String>(
//                List.of("A", "A", "B", "D", "B", "C", "D"));
//        // TODO: use stream distinct to return unique alphabets
//        List<String> distinct =
//        assertEquals(distinct.toString(), "[A, B, D, C]");
//    }
//
//    @Test
//    public void TestEmployeeFullnameUppercaseUsingForEachAndMap_ShouldPass() {
//        // TODO: use forEach to set employee first and last names toUpperCase
//        employees.forEach();
//        // TODO: use stream map to return a list of fullnames
//        List<String> fullNames =
//        assertEquals(fullNames.toString(), "[SHATYAM THEE, JAMES SOH, DERIAN TAN, JAMES BOND]");
//    }
//
//    @Test
//    public void TestEmployeeAddMultiplyUsingReduce_ShouldPass() {
//        List<Integer> integers = new ArrayList<Integer>(List.of(2, 3, 4, 5));
//        // TODO: use stream reduce to find total sum of integers
//        //  * reduce(starting number, (partial, element) -> operation) *
//        Integer totalSum =
//        // TODO: use stream reduce to find total multiplication of integers
//        Integer totalMultiply =
//        assertEquals(totalSum, 14);
//        assertEquals(totalMultiply, 120);
//    }
//
//    @Test
//    public void TestEmployeeSortFirstNameAsc_ShouldPass() {
//        // TODO: create firstName comparator using Comparator.comparing()
//        Comparator<Employee> compareByFirstName =
//        // TODO: Use stream sorted() to sort by comparator
//        List<Employee> sortedEmployees =
//        assertEquals(List.of(derian, james, jamesw, shat), sortedEmployees);
//    }
//
//    @Test
//    public void TestEmployeeSortFirstLastNameAsc_ShouldPass() {
//        // TODO: create multifield comparator using Comparator.comparing().thenComparing()
//        Comparator<Employee> compareByName =
//        // TODO: Use stream sorted() to sort by comparator
//        List<Employee> sortedEmployees =
//        assertEquals(List.of(derian, jamesw, james, shat), sortedEmployees);
//    }
//
//    @Test
//    public void TestEmployeeParallelForEachOrdered_ShouldPass() {
//        List<Double> salariesParallel = new ArrayList<Double>();
//        employees.parallelStream()
//                .forEachOrdered(x -> salariesParallel.add(x.getSalary()));
//        assertEquals(salariesParallel.toString(), "[9988.23, 10000.99, 15500.23, 0.0]");
//    }
//}
