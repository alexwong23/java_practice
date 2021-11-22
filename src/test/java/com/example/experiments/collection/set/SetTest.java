package com.example.experiments.collection.set;

import com.example.experiments.interview.InterviewThree;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    public static Logger log = LoggerFactory.getLogger(InterviewThree.class);
    private static int[] integers, integers2, uniqueIntegers, sortedIntegers;
    private Set<Integer> integerHashSet, integerTreeSet, integerLinkedHashSet, example;

    @BeforeAll
    public static void Initialise() {
        integers = new int[] {77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23};
        integers2 = new int[] {29, 4, 11, 112, 45, 23, 69, 77, 29, 23};
        uniqueIntegers = new int[] {77, 23, 4, 11, 69, 112, 45, 29};
        sortedIntegers = new int[] {4, 11, 23, 29, 45, 69, 77, 112};
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
    public void TestHashSet_ValueEquals_ShouldPass() {
        // TODO: compare integerHashSet to example
        assertTrue( );
    }

    @Test
    public void TestHashSet_OrderEquals_ShouldFail() {
        assertNotEquals(Arrays.toString(integers), integerHashSet.toString());
        // TODO: compare integerHashSet String to example String
        assertNotEquals( );
        // TODO: log to see the difference
        log.info("integers " + );
        log.info("integerHashSet" + );
    }

    @Test
    public void TestLinkedHashSet_ValueEquals_ShouldPass() {
        // TODO: compare integerLinkedHashSet to example
        assertTrue( );
    }

    @Test
    public void TestLinkedHashSet_OrderEquals_ShouldPass() {
        // TODO: compare integerLinkedHashSet String to insertion order
        assertEquals(integerLinkedHashSet.toString(), );
    }

    @Test
    public void TestTreeSet_ValueEquals_ShouldPass() {
        // TODO: compare integerTreeSet to example
        assertTrue( );
    }

    @Test
    public void TestTreeSet_OrderEquals_ShouldPass() {
        // TODO: compare integerTreeSet to sorted order
        assertEquals(integerTreeSet.toString(), );
    }

    @Test
    public void TestTreeSet_AddNull_ShouldThrowException() {
        // TODO: treeSet add null throws NullPointerException
        Exception exception =
        assertEquals(exception.getMessage(), null);
        assertTrue(integerTreeSet.equals(example));
    }

}
