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
        assertEquals(person.getName(), "James");
    }

    @Test
    public void TestPersonGetAge_ShouldPass() {
        assertEquals(person.getAge(), 24);
    }

    // NOTE: Using JUNIT 5 assertThrows method
    @Test()
    public void TestPersonSetName_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setName(null);
        });
        assertEquals(exception.getMessage(), "Error: Person name cannot be null");
    }

    @Test()
    public void TestPersonSetAge_One_ShouldPass() {
        person.setAge(1);
        assertEquals(person.getAge(), 1);
    }

    @Test()
    public void TestPersonSetAge_Hundred_ShouldPass() {
        person.setAge(100);
        assertEquals(person.getAge(), 100);
    }

    @Test()
    public void TestPersonSetAge_Zero_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setAge(0);
        });
        assertEquals(exception.getMessage(), "Error: Person age cannot be zero");
    }

    @Test()
    public void TestPersonSetAge_Negative_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setAge(-1);
        });
        assertEquals(exception.getMessage(), "Error: Person age must be positive");
    }

    @Test()
    public void TestPersonSetAge_AboveHundred_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setAge(101);
        });
        assertEquals(exception.getMessage(), "Error: Person cannot be above 100 years old");
    }

    @Test
    public void TestPerson_DifferentPeople_ShouldFail() {
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Chloe", 25);
        assertFalse(p1.equals(p2));
        assertFalse(p1.hashCode() == p2.hashCode());
    }

    @Test
    public void TestPerson_SameName_ShouldFail() {
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Alex", 25);
        assertFalse(p1.equals(p2));
        assertFalse(p1.hashCode() == p2.hashCode());
    }

    @Test
    public void TestPerson_SamePerson_ShouldPass() {
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Alex", 27);
        assertTrue(p1.equals(p2));
        assertTrue(p1.hashCode() == p2.hashCode());
    }
}
