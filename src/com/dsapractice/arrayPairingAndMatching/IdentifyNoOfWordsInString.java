package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class IdentifyNoOfWordsInString {
    public static void main(String[] args) {
        /*
        Given a String in camel case. Identify the no of words
        Example: input = "oneTwoThree"
                 output: 3
         */
        String input = "oneTwoThree";
        int wordcount = countWords(input);
        System.out.println(wordcount);
    }

    private static int countWords(String str) {
        List<String> words = new ArrayList<>();
        int st=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)) || i==str.length()-1){
               String word = str.substring(st,i);
               st=i;
               words.add(word);
            }
        }
        for(String s: words){
            System.out.println(s);
        }
        return words.size();
    }
}
