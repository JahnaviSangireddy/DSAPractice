package com.dsapractice.strings;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        /*
        For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

         Input: str1 = "ABCABC", str2 = "ABC"
         Output: "ABC"

         Input: str1 = "ABABAB", str2 = "ABAB"
         Output: "AB"
         */
        String str1="ABCABCABC";
        String str2="ABC";
        String gcdStr = findGcdString(str1,str2);

        System.out.println(gcdStr);
    }

    private static String findGcdString(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcdlength = gcd(str1.length(),str2.length());
        String gcdStr = str1.substring(0,gcdlength);
        return gcdStr;
    }

    private static int gcd(int length, int length1) {
        if(length1 == 0){
            return length;
        }
        return gcd(length1, length%length1);
    }
}
