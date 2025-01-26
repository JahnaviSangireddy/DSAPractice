package com.dsapractice.visa.test.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubStringWithKDistictChars {
    public static void main(String[] args) {
        String  s = "aba"; int k = 2;
        int count = findCountOfAllSubstrsWithKDistinctChars(s,k);
        System.out.println(count);
    }

    private static int findCountOfAllSubstrsWithKDistinctChars(String s, int k) {
        int end = 0, st = 0, count = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size() > k){
                char cst = s.charAt(st);
                map.put(cst,map.get(cst)-1);
                if(map.get(cst) == 0){
                    map.remove(cst);
                }
                st++;
            }
            if(map.size() == k){
                count = count + (end-st+1);
            }
            end++;
        }
        return count;
    }
}
