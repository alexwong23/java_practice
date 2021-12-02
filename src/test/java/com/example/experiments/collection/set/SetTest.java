package com.example.experiments.collection.set;

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
            // TODO: initialise integerHashSet and integerLinkedHashSet
            integerHashSet.
            integerLinkedHashSet.
        }
        integerTreeSet = new TreeSet<Integer>(integerHashSet); // NOTE: alternate initialisation
    }

    @Test
    public void TestSets_ValueEquals() {
        // integerHashSet       { 77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23 }
        // integerLinkedHashSet { 77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23 }
        // treeSet              { 77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23 }
        // example              { 29, 4, 11, 112, 45, 23, 69, 77, 29, 23 }
        // TODO: complete the assert method - assertTrue or assertFalse?
        assert_____(integerHashSet.equals(example));
        assert_____(integerLinkedHashSet.equals(example));
        assert_____(integerTreeSet.equals(example));
    }

    @Test
    public void TestSets_InsertionOrder() {
        // TODO: complete the assert method - assertEquals or assertNotEquals?
        //  * hint: consider the insertion and sort order *
        //  HashSet          - ___ insertion order, ___ sorted
        //  LinkedHashSet    - ___ insertion order, ___ sorted
        //  TreeSet          - ___ insertion order, ___ sorted
        assert_____(integerHashSet.toString(), "[77, 23, 4, 11, 69, 112, 45, 29]");
        assert_____(integerLinkedHashSet.toString(), "[77, 23, 4, 11, 69, 112, 45, 29]");
        assert_____(integerTreeSet.toString(), "[4, 11, 23, 29, 45, 69, 77, 112]");
    }

    @Test
    public void TestTreeSet_AddNull_ShouldThrowException() {
        // TODO: treeSet add null throws NullPointerException
        Exception exception =
        assertEquals(exception.getMessage(), null);
        assertTrue(integerTreeSet.equals(example));
    }
}
