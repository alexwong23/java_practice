package com.example.experiments.serializable;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class SerializableTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private Employee employee;
    private String fileName = "src/test/java/com/example/experiments/serializable/employee.txt";

    @BeforeEach
    public void Setup() {
        employee = new Employee("Chole", "Chau", 18, 9000.00);
    }

    @Test
    public void TestWriteObject_ShouldPass() throws IOException {
        FileOutputStream fout = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(employee);
        out.flush();
        out.close();
    }

    @Test
    public void TestReadObject_ShouldPass() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fin);
        Employee e = (Employee) in.readObject();
        assertTrue(e.getFirstName().equals(employee.getFirstName()));
        assertTrue(e.getLastName().equals(employee.getLastName()));
        assertTrue(e.getAge().equals(employee.getAge()));
        assertNull(e.getSalary());
        in.close();
    }

}
