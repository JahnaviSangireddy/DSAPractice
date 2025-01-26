package com.dsapractice.testques;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class SingleDigitFreq {
    public static void main(String[] args) {
        /*
        Input: arr = [23, 44, 123]

Digital roots:
        23: 2+3=5
        44: 4+4=8
        123: 1+2+3 =6
Frequencies: {5: 1, 8: 1, 6: 1}
Output: 8 (Tie between 5, 6, and 8. Return the largest single-digit.)

Input: arr = [99, 81, 18]

    Digital roots: 9+9=18->1+8=9
                    8+1=9
                    1+8=9
    freq map-> 9:3
    highest freq->9
    ouput: 9


         */
        int arr[] ={99,81,18};
        int higFreqSingDig = findHighestFreqSingleDigit(arr);
        System.out.println(higFreqSingDig);
    }

    private static int findHighestFreqSingleDigit(int[] arr) {
        int dig=0;
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i : arr){
            dig = findSingleDigit(i);
            freqMap.put(dig,freqMap.getOrDefault(dig,0)+1);
        }

        freqMap.forEach((k,v)-> System.out.println(k+":"+v));
        int maxfreq = freqMap.values().stream().max((v1,v2)->v1-v2).get();

        TreeSet<Integer> set = new TreeSet<>();
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == maxfreq){
                set.add(entry.getKey());
            }
        }
        if(set.size() > 1){
            return set.last();
        }
        return set.first();
    }

    private static int findSingleDigit(int num) {
        while(num > 10){
            int sum =0;
            while(num!=0){
                int digit = num%10;
                sum = sum + digit;
                num = num/10;
            }
            num = sum;
        }
        return num;
    }
}
