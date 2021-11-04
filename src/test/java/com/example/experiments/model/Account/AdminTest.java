package com.example.experiments.model.Account;

import com.example.experiments.model.Account.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Using JUNIT 5 assertThrows method
class AdminTest {

    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin("Alex", "unsafePassword");
        admin.setId(2222L);
    }

    @Test
    void TestGetId_Valid_ShouldPass() {
        assertEquals(admin.getId(), 2222L);
    }

    @Test
    void TestGetUsername_CaseSensitive_ShouldFail() {
        assertNotEquals(admin.getUsername(), "alex");
    }

    @Test
    void TestGetUsername_Valid_ShouldPass() {
        assertEquals(admin.getUsername(), "Alex");
    }

    @Test
    void TestGetPassword_CaseSensitive_ShouldFail() {
        assertNotEquals(admin.getPassword(), "UnsafePassword");
    }

    @Test
    void TestGetPassword_Valid_ShouldPass() {
        assertEquals(admin.getPassword(), "unsafePassword");
    }

    @Test()
    public void TestSetId_NullId_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            admin.setId(null);
        });
        assertEquals(exception.getMessage(), "Error: Id cannot be set to Null");
    }

    @Test
    void TestSetId_NegativeId_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            admin.setId(-2222L);
        });
        assertEquals(exception.getMessage(), "Error: Id cannot be negative");
    }

    // TODO: requires JPA to check if id is unique
//    @Test
//    void TestSetId_DuplicateId_ShouldThrowException() {
//    }

    @Test
    void TestSetId_IdZero_ShouldPass() {
        admin.setId(0L);
        assertEquals(admin.getId(), 0L);
    }

    @Test
    void TestSetId_ValidId_ShouldPass() {
        admin.setId(999L);
        assertEquals(admin.getId(), 999L);
    }

    @Test
    void TestSetUsername_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            admin.setUsername(null);
        });
        assertEquals(exception.getMessage(), "Error: Username cannot be set to Null");
    }

    // TODO: requires JPA to check if username is unique
//    @Test
//    void TestSetUsername_DuplicateUsername_ShouldThrowException() {
//    }

    @Test
    void TestSetUsername_Valid_ShouldPass() {
        admin.setUsername("Ericcccccc");
        assertEquals(admin.getUsername(), "Ericcccccc");
    }

    @Test
    void TestSetPassword_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            admin.setPassword(null);
        });
        assertEquals(exception.getMessage(), "Error: Password cannot be set to Null");
    }

    @Test
    void TestSetPassword_Valid_ShouldPass() {
        admin.setPassword("helloWorld");
        assertEquals(admin.getPassword(), "helloWorld");
    }
}
