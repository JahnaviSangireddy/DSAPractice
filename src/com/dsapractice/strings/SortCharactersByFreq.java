package com.dsapractice.strings;

import java.util.*;

public class SortCharactersByFreq {
    public static void main(String[] args) {
        String str="treesrarining";
        String freqSort = sortCharactersByFreq(str);
        System.out.println(freqSort);
    }

    private static String sortCharactersByFreq(String str) {
        char ch[] = str.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        for(int i=0; i<ch.length;i++){
            countMap.put(ch[i], countMap.getOrDefault(ch[i],0)+1);
        }

        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(countMap.entrySet());
        entryList.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        Map<Character, Integer> sortedMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        String freqsort="";
        sortedMap.forEach((k,v)-> System.out.println(k+" "+v));
        for(Map.Entry<Character,Integer> entry : sortedMap.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                freqsort = freqsort + entry.getKey();
            }
        }
        return freqsort;
    }
}
