package com.dsapractice.visa.test;

import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        String s="tree";
        String sortedstr = sortByFrequency(s);
        System.out.println(sortedstr);
    }

    private static String sortByFrequency(String s) {
        Map<Character,Integer> freqMap = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
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
