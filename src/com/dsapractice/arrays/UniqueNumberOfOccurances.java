package com.dsapractice.arrays;

import java.util.*;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {
        /*
        Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
         */

        int arr[] = {1, 2, 2, 2, 1, 1, 3};
        boolean b = occurancesUnique(arr);
        System.out.println(b);
    }

    private static boolean occurancesUnique(int[] arr) {
        Map<Integer, Integer> countmap = new HashMap<>();
        for(int i : arr){
            countmap.put(i,countmap.getOrDefault(i,0)+1);
        }
        Set<Integer> seenval = new HashSet<>();
        for(int i: countmap.values()){
            if(seenval.contains(i)){
                return false;
            }
            seenval.add(i);
        }

        return true;
    }
}
