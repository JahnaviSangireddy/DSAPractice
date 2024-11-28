package com.dsapractice.strings;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        boolean b = checkIfAnagrams(s1,s2);
        System.out.println(b);
    }

    private static boolean checkIfAnagrams(String s1, String s2) {
        char ch1[] = s1.toCharArray();
        Arrays.sort(ch1);
        String sorteds1 = new String(ch1);

        char ch2[] = s2.toCharArray();
        Arrays.sort(ch2);
        String sorteds2 = new String(ch2);

        if(sorteds1.equals(sorteds2)){
            return true;
        }
        return false;
    }
}
