package com.dsapractice.arrayPairingAndMatching;

import java.util.*;

public class AnagramGrops {
    public static void main(String[] args) {
        /*
        **Anagram Groups**
   - Group strings that are anagrams of each other.
   - Example: `Input: ["eat", "tea", "tan", "ate", "nat", "bat"]` → `Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]`
         */
        String input[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGrps = findAnagramGroups(input);
        for(List<String> res: anagramGrps){
            System.out.println(res);
        }
    }

    private static List<List<String>> findAnagramGroups(String[] input) {
        List<List<String>> reslist = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str: input){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s,list);
            }
        }
        for(List<String> l : map.values()){
            reslist.add(l);
        }
        return reslist;
    }
}
