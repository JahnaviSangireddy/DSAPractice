package com.dsapractice.codesignalIntro;

import java.util.HashMap;
import java.util.Map;

public class CountCommonCharsIn2Strings {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given two strings, find the number of common characters between them.

    Example

    For s1 = "aabcc" and s2 = "adcaa", the output should be solution(s1, s2) = 3.
    Strings have 3 common characters - 2 "a"s and 1 "c".
         */
        String s1="aabcc"; String s2="adcaa";
        int count = noOfCommonChars(s1,s2);
        System.out.println(count);
    }

    private static int noOfCommonChars(String s1, String s2) {
        int commonCharCount=0;
        Map<Character,Integer> freqmap = new HashMap<>();
        for(char c: s1.toCharArray()){
            freqmap.put(c,freqmap.getOrDefault(c,0)+1);
        }

        freqmap.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println("******************");

        for(char c : s2.toCharArray()){
            if(freqmap.containsKey(c) && freqmap.get(c) > 0){
                    commonCharCount++;
                    freqmap.put(c,freqmap.get(c)-1);
            }
        }
        return commonCharCount;
    }
}
