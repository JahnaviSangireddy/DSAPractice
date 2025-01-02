package com.dsapractice.codesignalIntro;

import java.util.HashMap;
import java.util.Map;

public class EncodeString {
    public static void main(String[] args) {
        /*
          Example

    For s = "aabbbc", the output should be
    solution(s) = "2a3bc".
         */
        String s="aabbbc";
        String encodedStr = findEncodedString(s);
        System.out.println(encodedStr);
    }

    private static String findEncodedString(String s) {
        StringBuilder str = new StringBuilder();
       Map<Character,Integer> countMap = new HashMap<>();
       for(char c : s.toCharArray()){
           countMap.put(c,countMap.getOrDefault(c,0)+1);
       }
       for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
           if(entry.getValue()>1){
               str.append(entry.getValue()).append(entry.getKey());
           }else{
               str.append(entry.getKey());
           }
       }
       return str.toString();
    }
}
