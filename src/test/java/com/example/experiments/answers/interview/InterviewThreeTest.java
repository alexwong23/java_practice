package com.example.experiments.answers.interview;

import com.example.experiments.interview.three.EmployeeAgeCompare;
import com.example.experiments.interview.three.EmployeeSalaryCompare;
import com.example.experiments.interview.three.InterviewThree;
import com.example.experiments.interview.three.InterviewThreeUsingList;
import com.example.experiments.model.Employee;
import com.example.experiments.model.FirstLastNameCompare;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewThreeTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private InterviewThree groupedByAnagram;
    private InterviewThreeUsingList groupedByAnagramList;
    private static List<String> words;
    private List<Employee> employees;
    private Employee derian, shat, james, jamesw;

    @BeforeAll
    public static void Initialise() {
        words = new ArrayList<>(
                List.of("eat", "tea", "tan", "ate", "nat", "tea", "bat"));
    }

    @BeforeEach
    public void Setup() {
        derian = new Employee("Derian", "Tan", 26, 15500.23);
        shat = new Employee("Shatyam", "Thee", 24, 9988.23);
        james = new Employee("James", "Soh", 24, 10000.99);
        jamesw = new Employee("James", "Bond", 19, 10000.99);
        employees = new ArrayList<>(
                List.of(shat, james, derian, jamesw) // initialise with elements
        );
    }

    @Test
    public void TestGroupAnagram_HashMap_ShouldPass() {
        groupedByAnagram = new InterviewThree(words);
        assertEquals(groupedByAnagram.getGroupByKey("eat"), null);
        assertEquals(groupedByAnagram.getGroupByKey("aet").toString(), "[eat, tea, ate]");
        assertEquals(groupedByAnagram.getGroupByKey("abt").toString(), "[bat]");
        assertEquals(groupedByAnagram.getGroupByKey("ant").toString(), "[tan, nat]");
        log.info(groupedByAnagram.toString());
    }

    @Test
    public void TestGroupAnagram_List_ShouldPass() {
        groupedByAnagramList = new InterviewThreeUsingList(words);
        assertEquals(groupedByAnagramList.getGroupByIndex(-1), null);
        assertEquals(groupedByAnagramList.getGroupByIndex(4), null);
        assertEquals(groupedByAnagramList.getGroupByIndex(0).toString(), "[eat, tea, ate]");
        assertEquals(groupedByAnagramList.getGroupByIndex(1).toString(), "[tan, nat]");
        assertEquals(groupedByAnagramList.getGroupByIndex(2).toString(), "[bat]");
        log.info(groupedByAnagramList.toString());
    }

    // TODO: problem statement 2
    //     Given a list of unique names
    //     Return value in ascending order
    @Test
    public void TestUniqueNames_TreeSet_ShouldPass() {
        employees.add(new Employee("James", "Bond", 22, 1000000.0)); // add a duplicate employee to test uniqueness
        List<String> employeeNames = employees.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        assertEquals(employeeNames.toString(), "[Shatyam Thee, James Soh, Derian Tan, James Bond, James Bond]");

        Set<Employee> uniqueEmployees = new TreeSet<Employee>(new FirstLastNameCompare());
        uniqueEmployees.addAll(employees);
        List<String> uniqueNames = uniqueEmployees.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        assertEquals(uniqueNames.toString(), "[Derian Tan, James Bond, James Soh, Shatyam Thee]");
    }

    // TODO: problem statement 3
    //     Given a collection of employees (id, name salary)
    //     Get names of employees in ascending order based on age
    //     Get names of employees in ascending order based on salary

    @Test
    public void TestEmployee_AgeCompare_ShouldPass() {
        EmployeeAgeCompare employeeAgeCompare = new EmployeeAgeCompare();
        Collections.sort(employees, employeeAgeCompare);
        List<String> names = employees.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        assertEquals(names.toString(), "[James Bond, Shatyam Thee, James Soh, Derian Tan]");
    }

    @Test
    public void TestEmployee_SalaryCompare_ShouldPass() {
        EmployeeSalaryCompare employeeSalaryCompare = new EmployeeSalaryCompare();
        Collections.sort(employees, employeeSalaryCompare);
        List<String> names = employees.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        assertEquals(names.toString(), "[Shatyam Thee, James Soh, James Bond, Derian Tan]");
    }

    // TODO: Challenge
    //     Get employee names in ascending order based on age, firstname and lastname
    //     Get employee names in ascending order based on salary, firstname and lastname
    //     * hint: use Comparator.comparing().thenComparing() *

    @Test
    public void TestEmployee_AgeFirstLastNameCompare_ShouldPass() {
        Comparator<Employee> ageFirstLastNameCompare = Comparator.comparing(Employee::getAge)
                .thenComparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);
        List<String> names = employees.stream()
                .sorted(ageFirstLastNameCompare)
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        assertEquals(names.toString(), "[James Bond, James Soh, Shatyam Thee, Derian Tan]");
    }

    @Test
    public void TestEmployee_SalaryFirstLastNameCompare_ShouldPass() {
        Comparator<Employee> salaryFirstLastNameCompare = Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);
        List<String> names = employees.stream()
                .sorted(salaryFirstLastNameCompare)
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
        assertEquals(names.toString(), "[Shatyam Thee, James Bond, James Soh, Derian Tan]");
    }
}
