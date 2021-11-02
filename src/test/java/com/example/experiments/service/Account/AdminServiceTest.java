package com.example.experiments.service.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Using JUNIT 5 assertThrows method
class AdminServiceTest {

    private AdminService adminService;

    @BeforeEach
    void setUp() {
        adminService = new AdminService("Alex", "unsafePassword");
        adminService.setId("2f2f");
    }

    @Test
    void TestGetId_CaseSensitive_ShouldFail() {
        assertNotEquals(adminService.getId(), "2F2F");
    }

    @Test
    void TestGetId_Valid_ShouldPass() {
        assertEquals(adminService.getId(), "2f2f");
    }

    @Test
    void TestGetUsername_CaseSensitive_ShouldFail() {
        assertNotEquals(adminService.getUsername(), "alex");
    }

    @Test
    void TestGetUsername_Valid_ShouldPass() {
        assertEquals(adminService.getUsername(), "Alex");
    }

    @Test
    void TestGetPassword_CaseSensitive_ShouldFail() {
        assertNotEquals(adminService.getPassword(), "UnsafePassword");
    }

    @Test
    void TestGetPassword_Valid_ShouldPass() {
        assertEquals(adminService.getPassword(), "unsafePassword");
    }

    @Test()
    public void TestSetId_NullId_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            adminService.setId(null);
        });
        assertEquals(exception.getMessage(), "Error: Id cannot be set to Null");
    }

    @Test
    void TestSetId_NegativeId_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            adminService.setId("-2");
        });
        assertEquals(exception.getMessage(), "Error: Id cannot be negative");
    }

    // TODO: requires JPA to check if id is unique
//    @Test
//    void TestSetId_DuplicateId_ShouldThrowException() {
//    }

    @Test
    void TestSetId_IdHyphen_ShouldPass() {
        adminService.setId("3-a2");
        assertEquals(adminService.getId(), "3-a2");
    }

    @Test
    void TestSetId_ValidId_ShouldPass() {
        adminService.setId("22");
        assertEquals(adminService.getId(), "22");
    }

    @Test
    void TestSetUsername_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            adminService.setUsername(null);
        });
        assertEquals(exception.getMessage(), "Error: Username cannot be set to Null");
    }

    // TODO: requires JPA to check if username is unique
//    @Test
//    void TestSetUsername_DuplicateUsername_ShouldThrowException() {
//    }

    @Test
    void TestSetUsername_Valid_ShouldPass() {
        adminService.setUsername("Ericcccccc");
        assertEquals(adminService.getUsername(), "Ericcccccc");
    }

    @Test
    void TestSetPassword_Null_ShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            adminService.setPassword(null);
        });
        assertEquals(exception.getMessage(), "Error: Password cannot be set to Null");
    }

    @Test
    void TestSetPassword_Valid_ShouldPass() {
        adminService.setPassword("helloWorld");
        assertEquals(adminService.getPassword(), "helloWorld");
    }
}
