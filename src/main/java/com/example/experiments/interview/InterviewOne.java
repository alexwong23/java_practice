package com.example.experiments.interview;

import java.util.Arrays;

public class InterviewOne {

    private int[] integers;

    public InterviewOne(int[] integers) {
        this.integers = integers;
    }

    //    TODO: Given an array, input, of n integers where n > 1,
    //        return an array, output, such that output[i]
    //        is equal to the product/multiplication of all the elements
    //        of input except input[i].
    //      Example:
    //        Input:  [1,2,3,4]
    //        Output: [24,12,8,6]

    public int[] multiply() {
        int total = 1;
        int numZeroes = 0;
        int indexZero = 0;
        for (int i: this.integers) {
            if(i == 0) {
                numZeroes++;
                indexZero = i;
            } else {
                total *= i;  // ignore zeroes
            }
        }
        int[] result = new int[this.integers.length];
        Arrays.setAll(result, p -> p = 0); // dynamically set array of zeroes

        if (numZeroes == 1) { // case with one zero
            result[indexZero] = total;
        } else if (numZeroes == 0) { // if more than one zero, output defo zero
            for (int i = 0; i < integers.length; i++) {
                result[i] = total / this.integers[i];
            }
        }
        return result;
    }

    // TODO: additional question - can we use this same method for divide?
    //  answer: no, if we have to divide i by other elements, we cannot use total

    public int[] getIntegers() {
        return integers;
    }

    public void setIntegers(int[] integers) {
        this.integers = integers;
    }
}
