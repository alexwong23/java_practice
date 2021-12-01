package com.example.experiments.interview.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewOneUsingList {

    private List<Integer> integers;

    public InterviewOneUsingList(List<Integer> integers) {
        this.integers = integers;
    }

    //    TODO: Given an array, input, of n integers where n > 1,
    //        return an array, output, such that output[i]
    //        is equal to the product/multiplication of all the elements
    //        of input except input[i].
    //      Example:
    //        Input:  [1,2,3,4]
    //        Output: [24,12,8,6]

    public List<Integer> multiply() {
        int total = this.integers.stream()
                .filter(p -> !(p == null || p == 0))
                .reduce(1, (partial, num) -> partial * num);
        long numZeroes = this.integers.stream()
                .filter(p -> (p == null || p == 0))
                .count();

        List<Integer> result = new ArrayList<Integer>(
                Arrays.asList(new Integer[this.integers.size()])
        );
        Collections.fill(result, 0); // dynamically set array of zeroes

        if (numZeroes == 1) {
            int zeroIndex = this.integers.indexOf(0);
            result.set(zeroIndex, total);
        } else if (numZeroes == 0) {
            result.clear();
            result.addAll(this.integers);
            result = result.stream()
                    .map(p -> p = (p == null || p == 0) ? 0 : total / p)
                    .collect(Collectors.toList());
        }
        return result;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }
}
