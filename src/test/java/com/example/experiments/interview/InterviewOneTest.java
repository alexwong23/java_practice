//package com.example.experiments.interview;
//
//import com.example.experiments.interview.one.InterviewOne;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class InterviewOneTest {
//
//    public static Logger log = LoggerFactory.getLogger(InterviewOne.class);
//    private InterviewOne interviewOne;
//    private int[] integers;
//
////    Multiply Examples:
////    Input:  [1,2,3,4]
////    Output: [24,12,8,6]
//
////    TODO: what are the edge, corner and boundary cases?
////      hint *answers are in the test names*
//
////    Input:   [ , , , ]  // TODO:
////    Output:  [ , , , ]
////
////    Input:  [ , , , ]  // TODO:
////    Output: [ , , , ]
////
////    Input:  [ , , , ]  // TODO:
////    Output: [ , , , ]
//
//    @Test
//    public void TestMultiply_OutputLength_ShouldPass() {
//        integers = new int[] { 1, 2, 3, 4 };
//        interviewOne = new InterviewOne(integers);
//        assertEquals(, 4);  // TODO:
//    }
//
//    @Test
//    public void TestMultiply_OutputNormal_ShouldPass() {
//        integers = new int[] { 1, 2, 3, 4 };
//        interviewOne = new InterviewOne(integers);
//        assertEquals("[24, 12, 8, 6]", Arrays.toString(interviewOne.multiply()));
//    }
//
//    @Test
//    public void TestMultiply_OutputNormalFive_ShouldPass() {
//        integers = new int[] { 5, 6, 7, 8, 9 };
//        interviewOne = new InterviewOne(integers);
//        assertEquals(, 5);  // TODO:
//        assertEquals("[3024, 2520, 2160, 1890, 1680]", Arrays.toString(interviewOne.multiply()));
//    }
//
//    @Test
//    public void TestMultiply_Negative_ShouldPass() {
//        integers = new int[] { 1, -2, 3, -4 };
//        interviewOne = new InterviewOne(integers);
//        assertEquals("[, , , ]", Arrays.toString(interviewOne.multiply()));  // TODO:
//    }
//
//    @Test
//    public void TestMultiply_ManyZeroes_ShouldPass() {
//        integers = new int[] { 0, 0, 3, 4 };
//        interviewOne = new InterviewOne(integers);
//        assertEquals("[, , , ]", Arrays.toString(interviewOne.multiply()));  // TODO:
//    }
//
//    @Test
//    public void TestMultiply_SingleZero_ShouldPass() {
//        integers = new int[] { 0, 2, 3, 4 };
//        interviewOne = new InterviewOne(integers);
//        assertEquals("[24, 0, 0, 0]", Arrays.toString(interviewOne.multiply()));
//    }
//}
