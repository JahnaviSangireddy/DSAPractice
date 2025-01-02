package com.dsapractice.codesignalIntro;

import java.util.Arrays;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Define a word as a sequence of consecutive English letters. Find the longest
    word from the given string.

    Example

    For text = "Ready, steady, go!",
    the output should be solution(text) = "steady".
         */
        String text="Ready, steady, getsett, goooooooo!";
        String longestWord = findLongestWord(text);
        System.out.println(longestWord);
    }

    private static String findLongestWord(String text) {
        String arr [] = text.split(",");
        List<String> list = Arrays.stream(arr).sorted((s1, s2)->s1.length()-s2.length()).toList();
        return list.get(list.size()-1);
    }
}
