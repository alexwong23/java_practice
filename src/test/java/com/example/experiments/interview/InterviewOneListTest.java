//package com.example.experiments.interview;
//
//import com.example.experiments.interview.one.InterviewOne;
//import com.example.experiments.interview.one.InterviewOneUsingList;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class InterviewOneListTest {
//
//    public static Logger log = LoggerFactory.getLogger(InterviewOne.class);
//    private InterviewOneUsingList interviewOneList;
//    private List<Integer> integers;
//
//    @Test
//    public void TestMultiply_OutputLength_ShouldPass() {
//        integers = new ArrayList<Integer>(List.of(1, 2, 3, 4));
//        interviewOneList = new InterviewOneUsingList(integers);
//        assertEquals(, 4); // TODO:
//    }
//
//    @Test
//    public void TestMultiply_OutputNormal_ShouldPass() {
//        integers = new ArrayList<Integer>(List.of(1, 2, 3, 4));
//        interviewOneList = new InterviewOneUsingList(integers);
//        assertEquals("[24, 12, 8, 6]", interviewOneList.multiply().toString());
//    }
//
//    @Test
//    public void TestMultiply_OutputNormalFive_ShouldPass() {
//        integers = new ArrayList<Integer>(List.of(5, 6, 7, 8, 9));
//        interviewOneList = new InterviewOneUsingList(integers);
//        assertEquals(, 5);  // TODO:
//        assertEquals("[3024, 2520, 2160, 1890, 1680]", interviewOneList.multiply().toString());
//    }
//
//    @Test
//    public void TestMultiply_Negative_ShouldPass() {
//        integers = new ArrayList<Integer>(List.of(1, -2, 3, -4));
//        interviewOneList = new InterviewOneUsingList(integers);
//        assertEquals("[, , , ]", interviewOneList.multiply().toString());  // TODO:
//    }
//
//    @Test
//    public void TestMultiply_ManyZeroes_ShouldPass() {
//        integers = new ArrayList<Integer>(List.of(0, 0, 3, 4));
//        interviewOneList = new InterviewOneUsingList(integers);
//        assertEquals("[, , , ]", interviewOneList.multiply().toString()); // TODO:
//    }
//
//    @Test
//    public void TestMultiply_SingleZero_ShouldPass() {
//        integers = new ArrayList<Integer>(List.of(0, 2, 3, 4));
//        interviewOneList = new InterviewOneUsingList(integers);
//        assertEquals("[24, 0, 0, 0]", interviewOneList.multiply().toString());
//    }
//}
