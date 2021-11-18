package com.example.experiments.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterviewThreeUsingList {

    // TODO: problem statement 1
    //     Given an array of strings,
    //     Group them by anagrams phrase (share same alphabets)
    //     e.g.
    //     input: [eat, tea, tan, ate, nat, bat]
    //     output: [(eat, tea, ate), (tan, nat), (bat)]

    private List<List<String>> groupedByAnagram;

    public InterviewThreeUsingList(List<String> words) {
        groupedByAnagram = new ArrayList<>();
        for (String word: words) {
            if(groupedByAnagram.size() < 1) // add first word
                groupedByAnagram.add(new ArrayList<>(List.of(word)));
            boolean foundGroup = false;
            for(int i = 0; i < groupedByAnagram.size(); i++) {
                String sortedWord = this.sortByAlphabets(word);
                String sortedGroup = this.sortByAlphabets(groupedByAnagram.get(i).get(0));
                if(sortedWord.equals(sortedGroup)) { // group found
                    foundGroup = true;
                    if(!groupedByAnagram.get(i).contains(word)) // add new word if not in group
                        groupedByAnagram.get(i).add(word);
                    break; // no need to iterate through other groups
                }
            }
            if(!foundGroup) // create new group since no group found
                groupedByAnagram.add(new ArrayList<>(List.of(word)));
        }
    }

    // TODO: note how to split String into chars
    public String sortByAlphabets(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<String> getGroupByIndex(int index) {
        if((groupedByAnagram.size() < index + 1) || index < 0 ) return null;
        return groupedByAnagram.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("groupedByAnagramList={");
        for(List<String> group: groupedByAnagram) {
            sb.append(group.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
