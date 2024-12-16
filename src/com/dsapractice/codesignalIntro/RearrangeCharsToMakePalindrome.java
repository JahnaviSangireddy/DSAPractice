package com.dsapractice.codesignalIntro;

import java.util.HashMap;
import java.util.Map;

public class RearrangeCharsToMakePalindrome {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given a string, find out if its characters can be rearranged to form a
    palindrome.

    Example

    For inputString = "aabb", the output should be
    solution(inputString) = true.

    We can rearrange "aabb" to make "abba", which is a palindrome.

    rules: there must be even number of same chars and only one unique char
         */
        String str = "aabbcd";
        boolean bool = checkIfCanBePalindrome(str);
        System.out.println(bool);
    }

    private static boolean checkIfCanBePalindrome(String str) {
        Map<Character,Integer> freqcount = new HashMap<>();
        for(char c: str.toCharArray()){
            freqcount.put(c,freqcount.getOrDefault(c,0)+1);
        }
        int oddnochars =0;
        for(int i : freqcount.values()){
            if(i%2 != 0){
                oddnochars++;
            }
        }
        if(oddnochars > 1){
            return false;
        }
        return true;

    }
}
