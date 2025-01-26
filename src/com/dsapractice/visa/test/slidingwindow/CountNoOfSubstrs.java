package com.dsapractice.visa.test.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountNoOfSubstrs {
    public static void main(String[] args) {
        String s="abaaca"; int k=1;
        int count = noOfSubstrsWithKDistictChars(s,k);
        System.out.println(count);
    }

    private static int noOfSubstrsWithKDistictChars(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int st=0, end=0, count=0;
        while(end<s.length()){
            char c = s.charAt(end);
            if(map.size() > k){
                char stchar = s.charAt(st);
                map.put(stchar,map.get(stchar)-1);
                if(map.get(stchar) == 0){
                    map.remove(c);
                }
                st++;
            }
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.size() == k){
                count = (k * (k+1)/2);
            }
            end++;
        }
        return count;
    }
}
