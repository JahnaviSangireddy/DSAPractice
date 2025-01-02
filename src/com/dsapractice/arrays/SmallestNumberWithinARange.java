package com.dsapractice.arrays;

public class SmallestNumberWithinARange {
    public static void main(String[] args) {
        /*
        Given an array, return smallest within the given range.
        Arr[1,5,12,2,8,6] range [2,7] output - 5
         */
        int arr[] = {1, 5, 12, 2, 8, 6}; int range[] = {2,7};
        int smallest = findSmallest(arr,range);
        System.out.println(smallest);
    }

    private static int findSmallest(int[] arr, int[] range) {
        int r1 = range[0], r2 = range[1];
        int smallest = Integer.MAX_VALUE;
        for(int i : arr){
            if(r1 < i && i < r2){
                if(i<smallest){
                    smallest =i;
                }
            }
        }
        return smallest;
    }
}
