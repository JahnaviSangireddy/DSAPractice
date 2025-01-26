package com.dsapractice.testques;

import java.util.HashSet;
import java.util.Set;

public class ReturnCountOfPairsBasedOnCondition {
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
        int count = validNumOfPairs(arr);
        System.out.println(count);
    }

    private static int validNumOfPairs(int[] arr) {
        Set<String> pairs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(checkValid(arr[i],arr[j])){
                    String s = arr[i]>arr[j]?""+arr[i]+arr[j]+"":""+arr[j]+arr[i]+"";
                    pairs.add(s);
                }
            }
        }
        return pairs.size();
    }

    private static boolean checkValid(int i, int i1) {
        String s1= i+"";
        String s2= i1+"";
        int mismatch=0;
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int j=0; j<s1.length(); j++){
            if(s1.charAt(j) != s2.charAt(j)){
                mismatch++;
            }
        }
        if(mismatch>1){
            return false;
        }
        return true;
    }
}
