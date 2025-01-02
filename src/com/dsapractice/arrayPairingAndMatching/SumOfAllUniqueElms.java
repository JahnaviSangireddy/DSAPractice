package com.dsapractice.arrayPairingAndMatching;

import java.util.HashMap;
import java.util.Map;

public class SumOfAllUniqueElms {
    public static void main(String[] args) {
        /*
        **Sum of All Unique Elements**
    - Given an array, calculate the sum of all unique elements.
    - Example: `Input: [1, 2, 3, 2, 4, 1]` → `Output: 7` (`3 + 4`)
         */
        int arr[] = {1, 2, 3, 2, 4, 1};
        int sumOfUnqElms = findSumOfUniqElmns(arr);
        System.out.println(sumOfUnqElms);
    }

    private static int findSumOfUniqElmns(int[] arr) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i : arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == 1){
                sum = sum + entry.getKey();
            }
        }
        return sum;
    }
}
