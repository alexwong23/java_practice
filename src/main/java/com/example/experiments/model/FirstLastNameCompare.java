package com.example.experiments.model;

import java.util.Comparator;

public class FirstLastNameCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        int compareFirstName = e1.getFirstName().compareTo(e2.getFirstName());
        if(compareFirstName != 0) return compareFirstName;
        int compareLastName = e1.getLastName().compareTo(e2.getLastName());
        return compareLastName;
    }
}
