package com.dsapractice.visa.test.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s="cbaebabacdcab", p = "abc";
        List<Integer> indexes = findStartIndicesOfPAnagrams(s,p);
       // System.out.println(indexes[0]+","+indexes[1]);
        for(int i : indexes){
            System.out.print(i+" , ");
        }

    }

    private static List<Integer> findStartIndicesOfPAnagrams(String s, String p) {
        int st=0, end=0;
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> patternMap = new HashMap<>();
        for(char c : p.toCharArray()){
            patternMap.put(c,patternMap.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> winmap = new HashMap<>();
        for(end=0; end<s.length(); end++){
            char curr = s.charAt(end);
            winmap.put(curr,winmap.getOrDefault(curr,0)+1);
            int len = end-st+1;
            if(len >p.length()){
                char stchar = s.charAt(st);
                winmap.put(stchar,winmap.get(stchar)-1);
                if(winmap.get(stchar) == 0){
                    winmap.remove(stchar);
                }
                st++;
            }
            if(winmap.equals(patternMap)){
                list.add(st);
            }
        }
        return list;
    }
}
