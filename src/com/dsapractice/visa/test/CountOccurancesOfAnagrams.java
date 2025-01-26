package com.dsapractice.visa.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurancesOfAnagrams {
    public static void main(String[] args) {
        String str = "cbaebabacd", pattern = "abc";
        int countOfOccrs = findCountOfOccurancesOfAnagrams(str,pattern);
        System.out.println(countOfOccrs);
    }

    private static int findCountOfOccurancesOfAnagrams(String str, String pattern) {
        Map<Character,Integer> patternMap = new HashMap<>();
        for(char c : pattern.toCharArray()){
            patternMap.put(c,patternMap.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> winmap = new HashMap<>();
        int st=0, end=0, count=0;

        while(end<str.length()){
            char ch = str.charAt(end);
            winmap.put(ch,winmap.getOrDefault(ch,0)+1);
            if(end-st+1 > pattern.length()){
                char stchar = str.charAt(st);
                winmap.put(stchar,winmap.get(stchar)-1);
                if(winmap.get(stchar)== 0){
                    winmap.remove(stchar);
                }
                st++;
            }
            if(winmap.equals(patternMap)){
                count++;
            }
            end++;
        }
        return count;
    }
}
