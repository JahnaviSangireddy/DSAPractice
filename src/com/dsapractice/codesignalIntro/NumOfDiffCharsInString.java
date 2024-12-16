package com.dsapractice.codesignalIntro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumOfDiffCharsInString {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given a string, find the number of different characters in it.

    Example

    For s = "cabca", the output should be
    solution(s) = 3.

    There are 3 different characters a, b and c.
         */

        String s = "abcdeffedca";
        int no = findNoOfUniqueChars(s);
        System.out.println(no);
    }

    private static int findNoOfUniqueChars(String s) {
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}
