package com.example.experiments.interview;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InterviewTwoTest {

    //    TODO:
    //        1. Create an arraylist of person objects
    //        2. Insert person into arraylist
    //        3. Find anyone above 18 years of age
    //        4. Print name and age and total count
    //        5. Write test cases

    private List<Person> people;
    private static List<Person> predefinedPeople;
    private static Person james, josh, alex, underage, youngling;

    @BeforeAll
    public static void Initialise() {
        james = new Person("James", 23);
        underage = new Person("Underage", 16);
        josh = new Person("Josh", 25);
        youngling = new Person("Youngling", 18);
        alex = new Person("Alex", 27);
        predefinedPeople = new ArrayList<Person>(
                List.of(james, josh, alex)
        );
    }

    @BeforeEach
    public void Setup() {
        people = new ArrayList<Person>();
    }

    @Test
    public void TestPersonAdd_ShouldFail() {
        people.add(new Person("Chloe", 99));
        assertFalse(people.size() > 1);
        assertFalse(people.get(0).equals(new Person("Chloe", 98)) );
    }

    @Test
    public void TestPersonAdd_ShouldPass() {
        people.add(new Person("Chloe", 99));
        assertEquals(people.size(), 1);
        assertTrue(people.get(0).equals(new Person("Chloe", 99)) );
    }

    @Test
    public void TestPersonSetAge_ShouldPass() {
        people.add(new Person("Chloe", 99));
        assertEquals(people.size(), 1);
        assertTrue(people.get(0).equals(new Person("Chloe", 99)) );
    }

    @Test
    public void TestPersonSetName_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person(null, 99));
        });
        assertEquals(exception.getMessage(), "Error: Person name cannot be null");
        assertEquals(people.size(), 0);
    }

    // edge case - age 1 and 100
    // boundary case - age 0, 101, and negative

    @Test
    public void TestPersonSetAge_One_ShouldPass() {
        people.add(new Person("Chloe", 1));
        assertTrue(people.get(0).equals(new Person("Chloe", 1)));
        assertEquals(people.size(), 1);
    }

    @Test
    public void TestPersonSetAge_Hundred_ShouldPass() {
        people.add(new Person("Chloe", 100));
        assertTrue(people.get(0).equals(new Person("Chloe", 100)));
        assertEquals(people.size(), 1);
    }

    @Test
    public void TestPersonSetAge_Zero_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person("Alex", 0));
        });
        assertEquals(exception.getMessage(), "Error: Person age cannot be zero");
        assertEquals(people.size(), 0);
    }

    public void TestPersonSetAge_HundredOne_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person("Alex", 101));
        });
        assertEquals(exception.getMessage(), "Error: Person cannot be above 100 years old");
        assertEquals(people.size(), 0);
    }

    @Test
    public void TestPersonSetAge_Negative_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person("Alex", -1));
        });
        assertEquals(exception.getMessage(), "Error: Person age must be positive");
        assertEquals(people.size(), 0);
    }
}
