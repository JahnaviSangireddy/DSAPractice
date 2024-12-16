package com.dsapractice.strings;

import java.util.*;

public class SortCharactersByFrequency {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        /*
        Given a string s, sort it in decreasing order based on the frequency of
        the characters. The frequency of a character is the number of times it appears
        in the string.
        Input: s = "tree"
        Output: "eert"
         */

        String s="Aabb";
        String sorted = sortStringOnFrequency(s);
        System.out.println(sorted);

    }

    private static String sortStringOnFrequency(String s) {
        Map<Character,Integer> freqMap = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((e1,e2)->e2.getValue() - e1.getValue());

        for(Map.Entry<Character,Integer> entry : list){
            for(int i=0; i< entry.getValue(); i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
