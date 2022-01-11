package com.example.experiments.answers.question;

import com.example.experiments.questions.StringPattern;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringPatternTest {
    public static Logger log = LoggerFactory.getLogger(StringPattern.class);
    private StringPattern stringPattern;

    @Test
    public void TestGroupAnagram_HashMap_ShouldPass() {
        stringPattern = new StringPattern("The quick <brown> fox jumps over the <lazy> dog");
        HashSet<String> answer = new HashSet<>(List.of("brown", "lazy"));
        assertTrue(stringPattern.getResult().equals(answer));
    }
}
