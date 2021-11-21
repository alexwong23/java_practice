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
    // NOTE: according to natural order (if they implement Comparable) or according to Comparator
    private static PriorityQueue<Employee> employeesPQ;

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private static List<Employee> finalEmployees;
    private static Employee derian, shat, james, jamesw, mo;

    // TODO: concurrency?
    //  one of its uses is multithreading, when a resource is shared among multiple consumers

    // getfirst() && getlast()
    // push() && pop()
    // add(): add to end of Queue, throws exception if full
    // offer(): add to end of Queue, return false if full
    // remove(): remove the first element in Queue, throws exception if empty
    // poll(): remove the first element in Queue, return null if empty
    // element(): return (without removing) first element in Queue, throws exception if empty
    // peak(): return (without removing) first element in Queue, return null if empty // NOTE: useful method

    @BeforeAll() // executes once and before BeforeEach
    public static void InitialSetup () {
        derian = new Employee("Derian", "Tan", 26, 15500.23);
        shat = new Employee("Shatyam", "Thee", 24, 9988.23);
        james = new Employee("James", "Soh", 24, 10000.99);
        jamesw = new Employee("James", "Bond", 19, 0.0);
        mo = new Employee("Mohammed", "Salah", 28, 21000.99);
        employeesPQ = new PriorityQueue<>(new FirstLastNameCompare());
    }

    @BeforeEach
    public void Setup() {
        finalEmployees = new ArrayList<>(
                List.of(shat, james, derian, jamesw) // initialise with elements
        );
        employeesLL.addAll(finalEmployees);
        employeesPQ.addAll(finalEmployees);
    }

    @AfterEach
    public void Breakdown() {
        finalEmployees.clear();
        employeesLL.clear();
        employeesPQ.clear();
    }

    @Test
    public void TestQueue_InsertionOrder_ShouldFail() {
        assertEquals(employeesLL.toString(), finalEmployees.toString());
        assertNotEquals(getPQOrder(employeesPQ).toString(), finalEmployees.toString());

        // NOTE: toString() does not return sort order of PQ, so use poll() instead
        Collections.sort(finalEmployees, new FirstLastNameCompare());
        assertEquals(getPQOrder(employeesPQ).toString(), finalEmployees.toString());
    }

    @Test
    public void TestLinkedList_GetFirst_ShouldPass() {
        assertEquals(employeesLL.getFirst(), shat);
        assertTrue(employeesLL.contains(shat));
    }

    @Test
    public void TestLinkedList_GetLast_ShouldPass() {
        assertEquals(employeesLL.getLast(), jamesw);
        assertTrue(employeesLL.contains(jamesw));
    }

    @Test // NOTE: push to HEAD
    public void TestLinkedList_Push_ShouldPass() {
        employeesLL.push(mo);
        assertTrue(employeesLL.equals(List.of(mo, shat, james, derian, jamesw)));
    }

    @Test // NOTE: pop at HEAD
    public void TestLinkedList_Pop_ShouldPass() {
        employeesLL.pop();
        assertTrue(employeesLL.equals(List.of(james, derian, jamesw)));
    }

    @Test // NOTE: add to TAIL
    public void TestLinkedList_Add_ShouldPass() {
        employeesLL.add(mo);
        assertTrue(employeesLL.equals(List.of(shat, james, derian, jamesw, mo)));
    }

    @Test
    public void TestLinkedList_Offer_ShouldPass() {
        employeesLL.offer(mo);
        assertTrue(employeesLL.equals(List.of(shat, james, derian, jamesw, mo)));
    }

    @Test // NOTE: different from remove(employee) method for lists
    public void TestLinkedList_Remove_ShouldPass() {
        employeesLL.remove();
        assertTrue(employeesLL.equals(List.of(james, derian, jamesw)));
    }

    @Test
    public void TestLinkedList_Poll_ShouldPass() {
        assertEquals(employeesLL.poll(), shat);
        assertTrue(employeesLL.equals(List.of(james, derian, jamesw)));
    }

    @Test
    public void TestLinkedList_RemoveEmpty_ShouldThrowException() {
        employeesLL.clear();
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            employeesLL.remove();
        });
        assertEquals(exception.getMessage(), null);
        assertTrue(employeesLL.isEmpty());
    }

    @Test
    public void TestLinkedList_PollEmpty_ShouldFail() {
        employeesLL.clear();
        assertNull(employeesLL.poll());
        assertTrue(employeesLL.isEmpty());
    }


    @Test
    public void TestLinkedList_Element_ShouldPass() {
        assertEquals(employeesLL.element(), shat);
        assertTrue(employeesLL.equals(List.of(shat, james, derian, jamesw)));
    }

    @Test
    public void TestLinkedList_Peek_ShouldPass() {
        assertEquals(employeesLL.peek(), shat);
        assertTrue(employeesLL.equals(List.of(shat, james, derian, jamesw)));
    }

    @Test
    public void TestLinkedList_ElementEmpty_ShouldThrowException() {
        employeesLL.clear();
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            employeesLL.element();
        });
        assertEquals(exception.getMessage(), null);
        assertTrue(employeesLL.isEmpty());
    }

    @Test
    public void TestLinkedList_PeekEmpty_ShouldFail() {
        employeesLL.clear();
        assertNull(employeesLL.peek());
        assertTrue(employeesLL.isEmpty());
    }

    @Test
    public void TestPriorityQueue_Add_ShouldPass() {
        employeesPQ.add(mo);
        assertTrue(getPQOrder(employeesPQ).equals(List.of(derian, jamesw, james, mo, shat)));
    }

    @Test
    public void TestPriorityQueue_Offer_ShouldPass() {
        employeesPQ.offer(mo);
        assertTrue(getPQOrder(employeesPQ).equals(List.of(derian, jamesw, james, mo, shat)));
    }

    @Test
    public void TestPriorityQueue_Remove_ShouldPass() {
        employeesPQ.remove();
        assertTrue(getPQOrder(employeesPQ).equals(List.of(jamesw, james, shat)));
    }

    @Test
    public void TestPriorityQueue_Poll_ShouldPass() {
        employeesPQ.poll();
        assertTrue(getPQOrder(employeesPQ).equals(List.of(jamesw, james, shat)));
    }

    @Test
    public void TestPriorityQueue_Element_ShouldPass() {
        assertEquals(employeesPQ.element(), derian);
        assertTrue(getPQOrder(employeesPQ).equals(List.of(derian, jamesw, james, shat)));
    }

    @Test
    public void TestPriorityQueue_Peek_ShouldPass() {
        assertEquals(employeesPQ.peek(), derian);
        assertTrue(getPQOrder(employeesPQ).equals(List.of(derian, jamesw, james, shat)));
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
}
