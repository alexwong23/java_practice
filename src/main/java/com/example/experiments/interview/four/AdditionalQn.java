package com.example.experiments.interview.four;

public class AdditionalQn {

    // TODO:
    //  Question 2: With the two external API calls below,
    //      how can we call them in a non-blocking manner if the DB has 10,000 students?
    //      * hint: asking about multithreading *

    // NOTE: not sure

    public String getStudentName(Integer id) {
        return "hello";
    }

    public void notifyStudent(String studentName) {
        // sys out hello student
    }


    // TODO:
    //  Question 3: HTTP VERBS and endpoints for the API above

    // GET      - /api/v1/students
    // POST     - /api/v1/students
    // GET      - /api/v1/students/:id
    // PUT      - /api/v1/students/:id
    // DELETE   - /api/v1/students/:id


    // TODO:
    //  Question 4: Write an SQL query to retrieve max salary for each department
    //      Employee Table (id, name, salary, department)

    // SELECT department, MAX(salary)
    // FROM Employee
    // GROUP BY department;


    // TODO:
    //  Question 5: Write an SQL query to retrieve second highest salary for each department

    // NOTE: does not return if department only has one person
    // SELECT department, MAX(salary)
    // FROM Employee
    // WHERE salary not in (SELECT department, MAX(salary) FROM Employee GROUP BY department)
    // GROUP BY department

}
