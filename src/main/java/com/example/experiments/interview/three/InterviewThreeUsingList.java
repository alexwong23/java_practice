//package com.example.experiments.interview.three;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//public class InterviewThreeUsingList {
//
//    // TODO: problem statement 1
//    //     Given an array of strings,
//    //     Group them by anagrams phrase (share same alphabets)
//    //     e.g.
//    //     input: [eat, tea, tan, ate, nat, bat]
//    //     output: [(eat, tea, ate), (tan, nat), (bat)]
//
//    private List<List<String>> groupedByAnagram;
//
//    public InterviewThreeUsingList(List<String> words) {
//        groupedByAnagram = new ArrayList<>();
//        for (String word: words) {
//            // TODO: extra challenge
//        }
//    }
//
//    public String sortByAlphabets(String word) {
//        char[] chars = word.toCharArray();
//        Arrays.sort(chars);
//        return new String(chars);
//    }
//
//    public List<String> getGroupByIndex(int index) {
//        if((groupedByAnagram.size() < index + 1) || index < 0 ) return null;
//        return groupedByAnagram.get(index);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("groupedByAnagramList={");
//        for(List<String> group: groupedByAnagram) {
//            sb.append(group.toString());
//        }
//        sb.append("}");
//        return sb.toString();
//    }
//}
