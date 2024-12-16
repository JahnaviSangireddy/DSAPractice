package com.dsapractice.strings;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2="eidbaooo";
        boolean b = permutationsOfS1InS2(s1,s2);
        System.out.println(b);
    }

    private static boolean permutationsOfS1InS2(String s1, String s2) {
        Map<Character,Integer> countMap = new HashMap<>();
        for(char c : s1.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }
        countMap.forEach((k,v)-> System.out.println(k+" : "+v));
        int windowLength=s1.length();

        Map<Character,Integer> windowMap = new HashMap<>();
        for(int i=0; i<s2.length(); i++){
            windowMap.put(s2.charAt(i), windowMap.getOrDefault(s2.charAt(i),0)+1);

            if(i>=windowLength){
                char outchar = s2.charAt(i - windowLength);
                if (windowMap.get(outchar) == 1) {
                    windowMap.remove(outchar);
                } else {
                    windowMap.put(outchar, windowMap.get(outchar) - 1);
                }
            }

            if(windowMap.equals(countMap)){
                return true;
            }
        }

        return false;
    }
}
