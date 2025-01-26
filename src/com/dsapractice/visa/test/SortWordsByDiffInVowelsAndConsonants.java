package com.dsapractice.visa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWordsByDiffInVowelsAndConsonants {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "grape", "kiwi", "orange", "berry"};

        List<String> sortedWords = sortWords(words);
        System.out.println("Sorted Words: " + sortedWords);
    }

    private static List<String> sortWords(String[] words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        list.sort((word1,word2)->{
            int diff1 = diffInVowelsAndConsonants(word1);
            int diff2 = diffInVowelsAndConsonants(word2);
            if(diff1 != diff2){
                return diff2-diff1;
            }
            return word1.length()-word2.length();
        });
        return list;
    }

    private static int diffInVowelsAndConsonants(String word){
        int vowels=0, cons =0;
        for(char c : word.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                vowels++;
            }else{
                cons++;
            }
        }
        return vowels - cons;
    }
}
