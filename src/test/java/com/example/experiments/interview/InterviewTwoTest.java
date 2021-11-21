package com.example.experiments.interview;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class InterviewTwoTest {

    //    TODO:
    //        1. Create an arraylist of person objects
    //        2. Insert person into arraylist
    //        3. Find anyone above 18 years of age
    //        4. Print name and age and total count
    //        5. Write test cases

    private List<Person> people;
    private static Person james, josh, alex, underage, youngling;

    @BeforeAll
    public static void Initialise() {
        james = new Person("James", 23);
        underage = new Person("Underage", 16);
        josh = new Person("Josh", 25);
        youngling = new Person("Youngling", 18);
        alex = new Person("Alex", 27);
    }

    @BeforeEach
    public void Setup() {
        people = new ArrayList<Person>(
                List.of(james, underage, josh, youngling, alex));
    }

    @Test
    public void TestPerson_Find18Above_ShouldPass() {
        List<Person> adults = people.stream()
                .filter(p -> p.getAge() > 18)
                .collect(Collectors.toList());
        assertTrue(adults.equals(List.of(james, josh, alex)));
    }

    @Test
    public void TestPersonAdd_ShouldPass() {
        Person chloe = new Person("Chloe", 99);
        people.add(chloe);
        assertTrue(people.contains(chloe));
    }

    @Test
    public void TestPersonSetName_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person(null, 99));
        });
        assertEquals(exception.getMessage(), "Error: Person name cannot be null");
        assertEquals(people.size(), 5);
    }

    @Test
    public void TestPersonSetAge_ShouldPass() {
        people.get(0).setAge(88);
        assertTrue(people.get(0).getAge() == 88);
    }

    @Test // NOTE: edge case - age 1 and 100
    public void TestPersonSetAge_One_ShouldPass() {
        Person chloe = new Person("Chloe", 1);
        people.add(chloe);
        assertTrue(people.contains(chloe));
    }

    @Test
    public void TestPersonSetAge_Hundred_ShouldPass() {
        Person chloe = new Person("Chloe", 100);
        people.add(chloe);
        assertTrue(people.contains(chloe));
    }

    @Test // NOTE: boundary case - age 0, 101, and negative
    public void TestPersonSetAge_Zero_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person("Alex", 0));
        });
        assertEquals(exception.getMessage(), "Error: Person age cannot be zero");
        assertEquals(people.size(), 5);
    }

    public void TestPersonSetAge_HundredOne_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person("Alex", 101));
        });
        assertEquals(exception.getMessage(), "Error: Person cannot be above 100 years old");
        assertEquals(people.size(), 5);
    }

    @Test
    public void TestPersonSetAge_Negative_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            people.add(new Person("Alex", -1));
        });
        assertEquals(exception.getMessage(), "Error: Person age must be positive");
        assertEquals(people.size(), 5);
    }
}
