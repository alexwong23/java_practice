package com.example.experiments.model.Account;

import com.example.experiments.model.Account.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User(
                "julius99",
                "gloryOfRome",
                "juliuscaesar@gmail.com",
                "Julius",
                "Caesar",
                LocalDate.of(1994, Month.SEPTEMBER, 15));;
        user.setId(256L);
    }

    @Test
    public void TestGetId_Valid_ShouldPass() {
        assertEquals(user.getId(), 256L);
    }

    @Test
    public void TestGetUsername_CaseSensitive_ShouldFail() {
        assertNotEquals(user.getUsername(), "Julius99");
    }

    @Test
    public void TestGetUsername_Valid_ShouldPass() {
        assertEquals(user.getUsername(), "julius99");
    }

    @Test
    public void TestGetPassword_CaseSensitive_ShouldFail() {
        assertNotEquals(user.getPassword(), "GloryOfRome");
    }

    @Test
    public void TestGetPassword_Valid_ShouldPass() {
        assertEquals(user.getPassword(), "gloryOfRome");
    }
}
