package com.dsapractice.testques;

import java.util.HashMap;
import java.util.Map;

public class CountOfPairsWhereNumsAreEqual {
    public static void main(String[] args) {
        int arr[] = {456, 546, 654, 645, 455};
        int noOfPairs = findNoOfPairs(arr);
        System.out.println(noOfPairs);
    }

    private static int findNoOfPairs(int[] arr) {
        int count=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(NumsAreValid(arr[i],arr[j])){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean NumsAreValid(int num1, int num2) {
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character,Integer> freqmap = new HashMap<>();
        for(char c: s1.toCharArray()){
            freqmap.put(c,freqmap.getOrDefault(c,0)+1);
        }
        for(char c : s2.toCharArray()){
            if(freqmap.containsKey(c)){
                freqmap.put(c,freqmap.get(c)-1);
                if(freqmap.get(c) == 0){
                    freqmap.remove(c);
                }
            }
        }
        return freqmap.isEmpty();
    }
}
