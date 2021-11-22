package com.example.experiments.interview;

import com.example.experiments.model.Employee;

import java.util.*;

public class InterviewThree {

    private HashMap<String, List<String>> groupedByAnagram;

    // TODO: problem statement
    //     Given an array of strings,
    //     Group them by anagrams phrase (share same alphabets)
    //     e.g.
    //     input: [eat, tea, tan, ate, nat, bat]
    //     output: [(eat, tea, ate), (tan, nat), (bat)]

    public InterviewThree(List<String> words) {
        // TODO:

        for (String word: words) {

        }
    }

    // NOTE: how to split String into chars
    public String sortByAlphabets(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<String> getGroupByKey(String key) {
        if(!groupedByAnagram.containsKey(key)) return null;
        return groupedByAnagram.get(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("groupedByAnagram={");
        for(String key: groupedByAnagram.keySet()) {
            sb.append("" + key + "=");
            sb.append(groupedByAnagram.get(key).toString());
        }
        sb.append("}");
        return sb.toString();
    }
}

// TODO: problem statement 2
//     Given a list of unique names
//     Return value in ascending order


// TODO: problem statement 3
//     Given a collection of employees (id, name salary)
//     Get names of employees in ascending order based on age
//     Get names of employees in ascending order based on salary

// TODO:
class EmployeeAgeCompare {

}
class EmployeeSalaryCompare {

}

// TODO: problem statement 4
//      Table Employee: id name deptid
//	    Table Department: id name
//		Employee belongs to Department
//		    Write an SQL query to return the
//		    total number of employees in each dept
//		     ordered by number of employees in desc order
//  Answer:
//  TODO: write query below
//	SELECT
//	FROM
//	GROUP BY
//	HAVING
//	ORDER BY
