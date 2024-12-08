package com.dsapractice.twoPointersPatterns;

import java.util.Arrays;

public class ValidPalindromes {
    public static void main(String[] args) {
        /*
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
         */
        String s = "A man, a plan, a canal: Panama";
        String s1="0P";
        boolean b = checkValidPalindrome(s1);
        System.out.println(b);
    }

    private static boolean checkValidPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder cleaned = new StringBuilder();
        char ch[] = s.toCharArray();
        for(char c: ch){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(c);
            }
        }
        int i=0; int j=cleaned.length()-1;
        while(i<j){
            if(cleaned.charAt(i)!=cleaned.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
