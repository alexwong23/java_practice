package com.example.experiments.interview.four;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewFour {

    public HashSet<String> result;

    public InterviewFour(String phrase) {
        result = new HashSet<>();
        extractWords(phrase);
    }

    //    TODO: Parse String between brackets < >
    //      example:
    //      input: The quick <brown> fox jumps over the <lazy> dog
    //      output: brown, lazy

    public void extractWords(String phrase) {
        Pattern pattern = Pattern.compile("<(.*?)>"); // NOTE: curve brackets ( ) defines regex group for matcher.group()
        Matcher matcher = pattern.matcher(phrase);
        while(matcher.find()) {
            String word = matcher.group(1);
            result.add(word);
        }
    }

    public HashSet<String> getResult() {
        return result;
    }

}

