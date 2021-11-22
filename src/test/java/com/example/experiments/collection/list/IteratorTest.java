//package com.example.experiments.collection.list;
//
//import com.example.experiments.model.Employee;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class IteratorTest {
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
//    public void TestEmployeeGet_ShouldPass() {
//        // TODO: implement iterator for employee
//        //  * Iterator<?> i = object.iterator() *
//
//        // TODO: utilise iterator method next() to traverse
//        assertEquals(shat, ); // first element
//        assertEquals(james, );
//        assertEquals(derian, );
//        assertEquals(jamesw, );
//    }
//
//    @Test
//    public void TestEmployeeLoop_ShouldPass() {
//        // TODO: implement iterator for employee
//
//        // TODO: utilise while loop and method hasNext() to traverse
//        int counter = 0;
//        while( ) {
//            assertEquals(employees.get(counter), );
//            counter++;
//        }
//    }
//
//    @Test
//    public void TestEmployeeRemove_ShouldPass() {
//        // TODO: implement iterator for employee
//
//        // TODO: utilise while loop and method hasNext() to remove!
//        //  * use remove() *
//        while( ) {
//
//        }
//        assertEquals(employees.size(), 0);
//        assertEquals("[]", employees.toString());
//    }
//}
