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
        groupedByAnagram = new HashMap<>();
        for (String word: words) {
            String sortedWord = this.sortByAlphabets(word);
            if(groupedByAnagram.containsKey(sortedWord)) {
                if(!groupedByAnagram.get(sortedWord).contains(word))
                    groupedByAnagram.get(sortedWord).add(word);
            } else {
                groupedByAnagram.put(sortedWord,
                        new ArrayList<String>(List.of(word)));
            }
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

class EmployeeAgeCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        int diff = e1.getAge() - e2.getAge();
        if(diff != 0) return diff;
        int fNameDiff = e1.getFirstName().compareTo(e2.getFirstName());
        if(fNameDiff != 0) return fNameDiff;
        return e1.getLastName().compareTo(e2.getLastName());
    }
}
class EmployeeSalaryCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        int diff = (int) (e1.getSalary() - e2.getSalary());
        if(diff != 0) return diff;
        int fNameDiff = e1.getFirstName().compareTo(e2.getFirstName());
        if(fNameDiff != 0) return fNameDiff;
        return e1.getLastName().compareTo(e2.getLastName());
    }
}

// TODO: problem statement 4
//      Table Employee: id name deptid
//	    Table Department: id name
//		Employee belongs to Department
//		    Write an SQL query to return the
//		    total number of employees in each dept
//		     ordered by number of employees in desc order
//  Answer:
//	SELECT d.Name, COUNT(e.id) num_emps
//	FROM Employee e, Department d JOIN ON e.deptid=d.id
//	GROUP BY d.name
//	HAVING COUNT(e.id)
//	ORDER BY num_emps DESC;
