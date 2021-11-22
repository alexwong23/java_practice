package com.example.experiments.interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    public static Logger log = LoggerFactory.getLogger(Person.class);
    private Person person;

    @BeforeEach
    public void Setup() {
        person = new Person("James", 24);
    }

    @Test
    public void TestPersonGetName_ShouldPass() {
        // TODO: get person name
        assertEquals(, "James");
    }

    @Test
    public void TestPersonGetAge_ShouldPass() {
        // TODO: get person age
        assertEquals(, 24);
    }

    // NOTE: Using JUNIT 5 assertThrows method
    @Test
    public void TestPersonSetName_Null_ShouldThrowException() {
        // TODO: write assertThrows for setName null
        Exception exception =
                assertEquals(, "Error: Person name cannot be null");
        assertEquals(people.size(), 5);
    }

    @Test
    public void TestPersonSetAge_ShouldPass() {
        people.get(0).setAge(88);
        assertTrue( ); // TODO:
    }

    @Test // NOTE: edge case - age 1 and 100
    public void TestPersonSetAge_One_ShouldPass() {
        // TODO: add a person of age 1

        assertTrue(people.contains(chloe));
    }

    @Test
    public void TestPersonSetAge_Hundred_ShouldPass() {
        // TODO: add a person of age 100

        assertTrue(people.contains(chloe));
    }

    @Test // NOTE: boundary case - age 0, 101, and negative
    public void TestPersonSetAge_Zero_ShouldThrowException() {
        // TODO: write assertThrows for setAge 0
        Exception exception =
                assertEquals(, "Error: Person age cannot be zero");
        assertEquals(people.size(), 5);
    }

    public void TestPersonSetAge_HundredOne_ShouldThrowException() {
        // TODO: write assertThrows for setAge 101
        Exception exception =
                assertEquals(, "Error: Person cannot be above 100 years old");
        assertEquals(people.size(), 5);
    }

    @Test
    public void TestPersonSetAge_Negative_ShouldThrowException() {
        // TODO: write assertThrows for setAge -1
        Exception exception =
                assertEquals(, "Error: Person age must be positive");
        assertEquals(people.size(), 5);
    }

    @Test
    public void TestPerson_DifferentPeople_ShouldFail() {
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Chloe", 25);
        assertFalse(p1.equals(p2));
        assertFalse( ); // TODO: use hashcode
    }

    @Test
    public void TestPerson_SameName_ShouldFail() {
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Alex", 25);
        assertFalse(p1.equals(p2));
        assertFalse(); // TODO: use hashcode
    }

    @Test
    public void TestPerson_SamePerson_ShouldPass() {
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Alex", 27);
        assertTrue(p1.equals(p2));
        assertTrue(); // TODO: use hashcode
    }
}
