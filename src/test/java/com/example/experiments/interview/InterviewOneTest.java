package com.example.experiments.interview;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class InterviewOneTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private InterviewOne interviewOne;
    private int[] integers;

//    Multiply Examples:
//    Input:  [1,2,3,4]
//    Output: [24,12,8,6]
//
//    Input:  [1,-2,3,-4]
//    Output:  [24,-12,8,-6]
//
//    Input:  [0,2,3,4]
//    Output: [24,0,0,0]
//
//    Input:  [0,0,3,4]
//    Output: [0,0,0,0]

    @Test
    public void TestMultiply_OutputLength_ShouldPass() {
        integers = new int[] { 1, 2, 3, 4 };
        interviewOne = new InterviewOne(integers);
        assertEquals(interviewOne.multiply().length, 4);
    }

    @Test
    public void TestMultiply_OutputNormal_ShouldPass() {
        integers = new int[] { 1, 2, 3, 4 };
        interviewOne = new InterviewOne(integers);
        assertEquals("[24, 12, 8, 6]", Arrays.toString(interviewOne.multiply()));
    }

    @Test
    public void TestMultiply_OutputNormalFive_ShouldPass() {
        integers = new int[] { 5, 6, 7, 8, 9 };
        interviewOne = new InterviewOne(integers);
        assertEquals(interviewOne.multiply().length, 5);
        assertEquals("[3024, 2520, 2160, 1890, 1680]", Arrays.toString(interviewOne.multiply()));
    }

    @Test
    public void TestMultiply_Negative_ShouldPass() {
        integers = new int[] { 1, -2, 3, -4 };
        interviewOne = new InterviewOne(integers);
        assertEquals("[24, -12, 8, -6]", Arrays.toString(interviewOne.multiply()));
    }

    @Test
    public void TestMultiply_ManyZeroes_ShouldPass() {
        integers = new int[] { 0, 0, 3, 4 };
        interviewOne = new InterviewOne(integers);
        assertEquals("[0, 0, 0, 0]", Arrays.toString(interviewOne.multiply()));
    }

    @Test
    public void TestMultiply_SingleZero_ShouldPass() {
        integers = new int[] { 0, 2, 3, 4 };
        interviewOne = new InterviewOne(integers);
        assertEquals("[24, 0, 0, 0]", Arrays.toString(interviewOne.multiply()));
    }
}
