package com.dsapractice.strings;

public class DetectCapital {
    public static void main(String[] args) {
        /*
        We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
         */
        String word="Visa";
        boolean b = detectCapitalUse(word);
        System.out.println(b);
    }

    private static boolean detectCapitalUse(String word) {

        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }

        return false;
    }
}
