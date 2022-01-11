package com.example.experiments.answers.interview;

import com.example.experiments.interview.four.InterviewFour;
import com.example.experiments.interview.four.KeyValuePair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InterviewFourTest {
    public static Logger log = LoggerFactory.getLogger(InterviewFour.class);
    private InterviewFour interviewFour;
    private KeyValuePair charmander, squirtle, bulbasaur, pikachu;

    @BeforeEach
    public void Setup() {
        charmander = new KeyValuePair("Fire", "Charmander");
        squirtle = new KeyValuePair("Water", "Squirtle");
        bulbasaur = new KeyValuePair("Grass", "Bulbasaur");
        pikachu = new KeyValuePair("Electric", "Pikachu");
        interviewFour = new InterviewFour();
    }

    @Test
    public void TestOwnHashMap_Insert_ShouldPass() {
        interviewFour.put(charmander.getKey(), charmander.getValue());
        interviewFour.put(squirtle.getKey(), squirtle.getValue());
        interviewFour.put(bulbasaur.getKey(), bulbasaur.getValue());
        assertTrue(interviewFour.get("Fire").equals("Charmander"));
        assertTrue(interviewFour.get("Water").equals("Squirtle"));
        assertTrue(interviewFour.get("Grass").equals("Bulbasaur"));
    }


    @Test
    public void TestOwnHashMap_KeyDoesNotExist_ShouldFail() {
        interviewFour.put(charmander.getKey(), charmander.getValue());
        interviewFour.put(squirtle.getKey(), squirtle.getValue());
        Exception exception = assertThrows(NullPointerException.class, () -> {
            interviewFour.get("Electric");
        });
        assertEquals(exception.getMessage(), "Cannot find key Electric");
    }

    @Test
    public void TestOwnHashMap_DuplicateKeys_ShouldFail() {
        interviewFour.put(charmander.getKey(), charmander.getValue());
        interviewFour.put(squirtle.getKey(), squirtle.getValue());
        Exception exception = assertThrows(DuplicateKeyException.class, () -> {
            interviewFour.put(charmander.getKey(), charmander.getValue());
        });
        assertEquals(exception.getMessage(), "Fire already exists in own Hash Map");
    }
}
