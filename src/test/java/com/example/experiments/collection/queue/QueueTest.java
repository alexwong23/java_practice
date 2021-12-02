package com.example.experiments.collection.queue;

import com.example.experiments.model.Employee;
import com.example.experiments.model.FirstLastNameCompare;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private LinkedList<Employee> employeesLL = new LinkedList<>();
    private static PriorityQueue<Employee> employeesPQ;

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private static List<Employee> finalEmployees, sortByName;
    private static Employee derian, shat, james, jamesw, mo, chloe;

    @BeforeAll() // executes once and before BeforeEach
    public static void InitialSetup () {
        derian = new Employee("Derian", "Tan", 26, 15500.23);
        shat = new Employee("Shatyam", "Thee", 24, 9988.23);
        james = new Employee("James", "Soh", 24, 10000.99);
        jamesw = new Employee("James", "Bond", 19, 0.0);
        mo = new Employee("Mohammed", "Salah", 28, 21000.99);
        chloe = new Employee("Chloe", "Chua", 23, 5000.00);
        sortByName = new ArrayList<>(List.of(derian, jamesw, james, shat));
        // NOTE: according to natural order (if they implement Comparable) or according to Comparator
        // TODO: initialise employeesPQ with firstlast name in ascending order
        employeesPQ =
    }

    @BeforeEach
    public void Setup() {
        // initialise with elements
        finalEmployees = new ArrayList<>(List.of(shat, james, derian, jamesw));
        // TODO: add final employees to LL and PQ
        employeesLL.
        employeesPQ.
    }

    @AfterEach
    public void Breakdown() {
        finalEmployees.clear();
        employeesLL.clear();
        employeesPQ.clear();
    }

    @Test
    public void TestQueue_InsertionOrder_ShouldFail() {
        // TODO: complete the assert method - assertEquals or assertNotEquals?
        assert_____(employeesLL.toString(), finalEmployees.toString());
        assert_____(employeesPQ.toString(), finalEmployees.toString());

        assert_____(employeesPQ.toString(), sortByName.toString());
        // NOTE: PQ internal structure may NOT SORTED, so perform loop with poll()
        assert_____(getPQOrder(employeesPQ).toString(), sortByName.toString());
    }

    public List<Employee> getPQOrder(PriorityQueue<Employee> pq) {
        if(pq == null) return null;
        List<Employee> inOrder = new ArrayList<>();
        PriorityQueue<Employee> copyOf = new PriorityQueue<>(pq);
        while(!copyOf.isEmpty()) {
            inOrder.add(copyOf.poll());
        }
        return inOrder;
    }

    @Test
    public void TestLinkedList_GetHead_ShouldPass() {
        // NOTE: get from HEAD but not remove
        assertEquals(employeesLL.getFirst(), shat); // throws error when empty
        assertEquals(employeesLL.element(), shat);  // throws error when empty
        assertEquals(employeesLL.peek(), shat);     // return NULL when empty
        assertTrue(employeesLL.equals(List.of(shat, james, derian, jamesw)));

        // NOTE: get from HEAD and removes
        assertEquals(employeesLL.pop(), shat);      // throws error when empty
        assertEquals(employeesLL.remove(), james);  // throws error when empty
        assertEquals(employeesLL.poll(), derian);   // return NULL when empty
        assertTrue(employeesLL.equals(List.of(jamesw)));
    }

    @Test // NOTE: get from TAIL but not remove
    public void TestLinkedList_GetTail_ShouldPass() {
        assertEquals(employeesLL.getLast(), jamesw); // throws error when empty
        assertTrue(employeesLL.contains(jamesw));
    }

    @Test
    public void TestLinkedList_Add_ShouldPass() {
        // NOTE: add to HEAD
        employeesLL.push(mo);
        assertTrue(employeesLL.equals(List.of(mo, shat, james, derian, jamesw)));

        // NOTE: add to TAIL
        employeesLL.add(mo);        // throws error when full
        employeesLL.offer(chloe);   // return FALSE when full
        assertTrue(employeesLL.equals(List.of(mo, shat, james, derian, jamesw, mo, chloe)));
    }
}
