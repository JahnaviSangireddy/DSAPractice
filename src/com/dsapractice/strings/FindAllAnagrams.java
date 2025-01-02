package com.dsapractice.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static void main(String[] args) {
        /*
        Given two strings s and p, return an array of all the start indices of p's
anagrams
 in s. You may return the answer in any order.



Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

//generate freqMap of p
//Take all cosequent substrings of s of length=p.length and create freqmap
//compare freq map of p, substr if equal put the start index og substr in list
         */

        String s="abab";
        String p="ab";
        List<Integer> list = findAnagrams(s,p);
        for(int i : list){
            System.out.println(i);
        }
    }

    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> list = new ArrayList<>();

        if(s==null || p==null || s.length() < p.length()){
            return list;
        }

        Map<Character,Integer> pfreq = createFreqMap(p);
        int j=p.length();
        for(int i=0; i<=s.length()-j; i++){
            String sub = s.substring(i,i+j);
            Map<Character,Integer> freqMap = createFreqMap(sub);
            if(freqMap.equals(pfreq)){
                list.add(i);
            }
        }

        return list;
    }

    private static Map<Character, Integer> createFreqMap(String sub) {

        Map<Character,Integer> map = new HashMap<>();
        for(char c: sub.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
