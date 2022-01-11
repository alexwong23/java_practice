package com.example.experiments.questions;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern {

    public HashSet<String> result;

    public StringPattern(String phrase) {
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

