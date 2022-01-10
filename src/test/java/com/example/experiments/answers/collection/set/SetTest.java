package com.example.experiments.answers.collection.set;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private static int[] integers, integers2;
    private Set<Integer> integerHashSet, integerTreeSet, integerLinkedHashSet, example;

    @BeforeAll
    public static void Initialise() {
        integers = new int[] {77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23};
        integers2 = new int[] {29, 4, 11, 112, 45, 23, 69, 77, 29, 23};
    }

    @BeforeEach
    public void Setup() {
        example = new HashSet<Integer>();
        integerHashSet = new HashSet<Integer>();
        integerLinkedHashSet = new LinkedHashSet<Integer>();
        for(int integer: integers2)
            example.add(integer);
        for (int integer: integers) {
            integerHashSet.add(integer);
            integerLinkedHashSet.add(integer);
        }
        integerTreeSet = new TreeSet<Integer>(integerHashSet); // NOTE: alternate initialisation
    }

    @Test
    public void TestSets_ValueEquals() {
        // integerHashSet       { 77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23 }
        // integerLinkedHashSet { 77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23 }
        // treeSet              { 77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23 }
        // example              { 29, 4, 11, 112, 45, 23, 69, 77, 29, 23 }
        assertTrue(integerHashSet.equals(example));
        assertTrue(integerLinkedHashSet.equals(example));
        assertTrue(integerTreeSet.equals(example));
    }

    @Test
    public void TestSets_InsertionOrder() {
        // HashSet          - no insertion order, unsorted
        // LinkedHashSet    - has insertion order, unsorted
        // TreeSet          - no insertion order, but sorted
        assertNotEquals(integerHashSet.toString(), "[77, 23, 4, 11, 69, 112, 45, 29]");
        assertEquals(integerLinkedHashSet.toString(), "[77, 23, 4, 11, 69, 112, 45, 29]");
        assertEquals(integerTreeSet.toString(), "[4, 11, 23, 29, 45, 69, 77, 112]");
    }

    @Test
    public void TestTreeSet_AddNull_ShouldThrowException() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
           integerTreeSet.add(null);
        });
        assertEquals(exception.getMessage(), null);
        assertTrue(integerTreeSet.equals(example));
    }

}
