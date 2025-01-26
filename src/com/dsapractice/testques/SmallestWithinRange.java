package com.dsapractice.testques;

import static java.lang.Math.min;

public class SmallestWithinRange {
    public static void main(String[] args) {
        /*
        Given an array, return smallest within the given range. Arr[1,5,12,2,8,6] range [2,7] output -5
         */
        int arr[] = {1, 5, 12, 2, 8, 6};
        int nRange[] = {2,7};
        int smallest = findSmallestt(arr,nRange);
        System.out.println(smallest);
    }

    private static int findSmallestt(int[] arr, int[] nRange) {
        int minval=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if((arr[i] > nRange[0]) && (arr[i]<nRange[1])){
                int min =arr[i];
                minval = min(min,minval);
            }
           // System.out.println(minval);
        }
        return minval;
    }
}
