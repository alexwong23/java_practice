package com.example.experiments.answers.interview;

import com.example.experiments.interview.four.InterviewFour;
import com.example.experiments.interview.three.InterviewThree;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InterviewFourTest {
    public static Logger log = LoggerFactory.getLogger(InterviewFour.class);
    private InterviewFour interviewFour;

    @Test
    public void TestGroupAnagram_HashMap_ShouldPass() {
        interviewFour = new InterviewFour("The quick <brown> fox jumps over the <lazy> dog");
        HashSet<String> answer = new HashSet<>(List.of("brown", "lazy"));
        assertTrue(interviewFour.getResult().equals(answer));
    }
}
