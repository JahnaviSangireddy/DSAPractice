package com.dsapractice.codesignalIntro;

import java.util.Arrays;

public class AllLongestStrings {
     static int maxlength = 0;
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given an array of strings, return another array containing all of its longest
    strings.

    Example

    For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
    solution(inputArray) = ["aba", "vcd", "aba"].
         */
        String str[] = {"aba", "aa", "ad", "vcd", "aba"};
        String longeststrs [] = findLongestStrings(str);
        for(String s: longeststrs){
            System.out.println(s);
        }
    }

    private static String[] findLongestStrings(String[] str) {

        for(String s:str){
            if(s.length() > maxlength){
                maxlength = s.length();
            }
        }
       String outputarr[] = Arrays.stream(str).filter(s->s.length() == maxlength).toArray(String[] :: new);
        return outputarr;
    }
}
