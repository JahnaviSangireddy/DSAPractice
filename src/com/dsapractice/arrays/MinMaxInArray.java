package com.dsapractice.arrays;

import java.util.Arrays;

public class MinMaxInArray {

    public static void main(String[] args) {
        // Given an array arr. Your task is to find the minimum and maximum elements
        // in the array.
        //
        //Note: Return an array that contains two elements
        // the first one will be a minimum element and
        // the second will be a maximum of an array.

        int nums[] = {3, 2, 1, 56, 10000, 167};

        int arr[] = findMinAndMax(nums);
        System.out.println(arr[0]+" , "+ arr[1]);
    }

    private static int[] findMinAndMax(int[] nums) {

        int min = Arrays.stream(nums).min().getAsInt();
        Long l1 = (long) min;
        int max = Arrays.stream(nums).max().getAsInt();
        Long l2 = (long) max;
        return new int[]{min,max};
    }
}
