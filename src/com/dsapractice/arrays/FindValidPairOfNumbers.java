package com.dsapractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindValidPairOfNumbers {
    public static void main(String[] args) {
        /*
        given an array of numbers [1,153,1,9,54,353,22] return count of pair from array. Conditions-
1) length of the digit in pair should be the same.
2) except one digit in each number in the pair should be same. (153,353)
3) don't count the  repeated pair. (1,9)(9,1) Count 1.
Output - 3
Pairs are (1,1)(1,9),(153,353).
         */
        int arr[] = {1, 153, 1, 9, 54, 353, 22};
        int countOfValidPairs = findValidPairs(arr);
        System.out.println(countOfValidPairs);
    }

    private static int findValidPairs(int[] arr) {
        Set<String> pairs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(isValid(arr[i],arr[j])){
                    int a = arr[i];
                    int b = arr[j];
                    String s = a < b ? a+","+b : b+","+a;
                    pairs.add(s);
                }
            }
        }
        for(String x : pairs){
            System.out.println(x);
        }
        return pairs.size();
    }

    private static boolean isValid(int num1, int num2) {
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);

        if(s1.length() != s2.length()){
            return false;
        }
        int mismatch=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                mismatch++;
                if(mismatch > 1){
                    return false;
                }
            }
        }
        return true;
    }
}
