package com.dsapractice.codesignalIntro;

import static java.lang.Math.max;

public class MaxSumOfConsecutiveElms {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given array of integers, find the maximal possible sum of some of its k
    consecutive elements.

    Example

    For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
    solution(inputArray, k) = 8.

    All possible sums of 2 consecutive elements are:

    2 + 3 = 5;
    3 + 5 = 8;
    5 + 1 = 6;
    1 + 6 = 7.

    Thus, the answer is 8.
         */
       int inputArray[] = {2, 3, 5, 1, 6, 4}, k = 2;
       int maxSum = findMaxSum(inputArray,k);
        System.out.println(maxSum);
    }

    private static int findMaxSum(int[] inputArray, int k) {
        int maxsum=0;
        for(int i=0; i<inputArray.length-1;i++){
            int sum = inputArray[i]+inputArray[i+1];
            maxsum = max(sum,maxsum);
        }
        return maxsum;
    }
}
