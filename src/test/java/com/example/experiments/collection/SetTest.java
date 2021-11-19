package com.example.experiments.collection;

import com.example.experiments.interview.InterviewThree;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    public static Logger log = LoggerFactory.getLogger(InterviewThree.class);
    private static int[] integers, integers2;
    private Set<Integer> example;
    private Set<Integer> integerHashSet;
    private Set<Integer> integerTreeSet;

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
        for(int integer: integers2)
            example.add(integer);
        for (int integer: integers) {
            integerHashSet.add(integer);
            integerTreeSet.add(integer);
        }
    }

    @Test
    public void TestHashSetEquals_ShouldPass() {
        assertTrue(integerHashSet.equals(example));
    }

    @Test
    public void TestHashSetNotEquals_ShouldFail() {
        assertNotEquals(Arrays.toString(integers), integerHashSet.toString());
        assertNotEquals(integerHashSet.toString(), example.toString());
        log.info("integers " + Arrays.toString(integers));
        log.info("integerHashSet" + integerHashSet.toString());
    }

    @Test
    public void TestTreeSetEquals_ShouldPass() {
        assertTrue(integerTreeSet.equals(example));
        assertEquals(integerTreeSet.toString(), "[4, 11, 23, 29, 45, 69, 77, 112]");
    }

    @Test
    public void TestTreeSetNotEquals_ShouldFail() {
        assertNotEquals(Arrays.toString(integers), integerTreeSet.toString());
        assertNotEquals(integerTreeSet.toString(), example.toString());
        log.info("integerTreeSet" + integerTreeSet.toString());
    }
}
