package com.dsapractice.strings;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    /*
    Given a string licensePlate and an array of strings words, find the shortest completing word in words.

A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces in licensePlate, and treat letters as case insensitive. If a letter appears more than once in licensePlate, then it must appear in the word the same number of times or more.

For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice. Possible completing words are "abccdef", "caaacab", and "cbca".

Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple shortest completing words, return the first one that occurs in words.

Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
Output: "steps"
Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
"step" contains 't' and 'p', but only contains 1 's'.
"steps" contains 't', 'p', and both 's' characters.
"stripe" is missing an 's'.
"stepple" is missing an 's'.
Since "steps" is the only word containing all the letters, that is the answer.
     */
    public static void main(String[] args) {
      String  licensePlate = "Ah71752";
      String words[] = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
      String complword = findShortestCompletingWord(licensePlate,words);
        System.out.println(complword);
    }

    private static String findShortestCompletingWord(String licensePlate, String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        char ch[] = licensePlate.toLowerCase().toCharArray();
        for(char c : ch){
            if(!Character.isLetter(c)){
                continue;
            }
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map.forEach((k,v)-> System.out.println(k+" : "+v));

        String shortest = "";
        int minlen = Integer.MAX_VALUE;
        for(String word : words){
            boolean b = isCompleting(word,map);
           System.out.println("word :"+word+" isCompleting :"+b);
            if(b){
                if(word.length() < minlen){
                    shortest = word;
                    minlen = word.length();
                }
            }
            System.out.println("shortest "+shortest);
        }
        return shortest;
    }

    public static boolean isCompleting(String word, Map<Character,Integer> map){
        char ch[] = word.toLowerCase().toCharArray();
        Map<Character, Integer> cmap = new HashMap<>();
        for(char c: ch){
            cmap.put(c, cmap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            if(!cmap.containsKey(key) || cmap.get(key) < val){
                return false;
            }
        }
        return true;
    }
}
