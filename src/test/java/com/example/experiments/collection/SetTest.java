package com.example.experiments.collection;

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
    private static int[] integers, integers2;
    private Set<Integer> example;
    private Set<Integer> integerHashSet;
    private Set<Integer> integerTreeSet;
    private Set<Integer> integerLinkedHashSet;

    @BeforeAll
    public static void Initialise() {
        integers = new int[] {77, 23, 4, 11, 69, 77, 112, 45, 23, 29, 23};
        integers2 = new int[] {29, 4, 11, 112, 45, 23, 69, 77, 29, 23};
    }

    @BeforeEach
    public void Setup() {
        example = new HashSet<Integer>();
        integerHashSet = new HashSet<Integer>();
        integerTreeSet = new TreeSet<Integer>(integerHashSet);
        integerLinkedHashSet = new LinkedHashSet<Integer>();
        for(int integer: integers2)
            example.add(integer);
        for (int integer: integers) {
            integerHashSet.add(integer);
            integerTreeSet.add(integer);
            integerLinkedHashSet.add(integer);
        }
    }

    @Test
    public void TestHashSet_ValueEquals_ShouldPass() {
        assertTrue(integerHashSet.equals(example));
    }

    @Test
    public void TestHashSet_OrderEquals_ShouldFail() {
        assertNotEquals(Arrays.toString(integers), integerHashSet.toString());
        assertNotEquals(integerHashSet.toString(), example.toString());
        log.info("integers " + Arrays.toString(integers));
        log.info("integerHashSet" + integerHashSet.toString());
    }

    @Test
    public void TestTreeSet_ValueEquals_ShouldPass() {
        assertTrue(integerTreeSet.equals(example));
        assertEquals(integerTreeSet.toString(), "[4, 11, 23, 29, 45, 69, 77, 112]");
    }

    @Test
    public void TestTreeSet_OrderEquals_ShouldFail() {
        assertNotEquals(Arrays.toString(integers), integerTreeSet.toString());
        assertNotEquals(integerTreeSet.toString(), example.toString());
        log.info("integerTreeSet" + integerTreeSet.toString());
    }

    @Test
    public void TestTreeSet_AddNull_ShouldThrowException() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
           integerTreeSet.add(null);
        });
        assertEquals(exception.getMessage(), null);
        assertTrue(integerTreeSet.equals(example));
    }

    @Test
    public void TestLinkedHashSet_ValueEquals_ShouldPass() {
        assertTrue(integerLinkedHashSet.equals(example));
    }

    @Test
    public void TestLinkedHashSet_OrderEquals_ShouldPass() {
        assertEquals(integerLinkedHashSet.toString(), "[77, 23, 4, 11, 69, 112, 45, 29]");
    }

}
