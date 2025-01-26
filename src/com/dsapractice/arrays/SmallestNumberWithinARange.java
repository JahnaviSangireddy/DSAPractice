package com.dsapractice.arrays;

import static java.lang.Math.min;

public class SmallestNumberWithinARange {
    public static void main(String[] args) {
        /*
        Given an array, return smallest within the given range.
        Arr[1,5,12,2,4,8,6] range [2,7] output - 4
         */
        int arr[] = {1, 5, 12, 2, 4, 8, 6}; int range[] = {2,7};
        int smallest = findSmallest(arr,range);
        System.out.println(smallest);
    }

    private static int findSmallest(int[] arr, int[] range) {
        int r1 = range[0], r2 = range[1];
        int smallest = Integer.MAX_VALUE;
        for(int i : arr){
            if(r1 < i && i < r2){
                smallest = min(smallest,i);
            }
        }
        return smallest;
    }
}
