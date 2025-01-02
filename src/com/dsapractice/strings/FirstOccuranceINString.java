package com.dsapractice.strings;

public class FirstOccuranceINString {
    public static void main(String[] args) {
        /*
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
         */
        String haystack = "sadbutsad", needle = "sad";
        int index = findFirstOccurance(haystack,needle);
        System.out.println(index);
    }

    private static int findFirstOccurance(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
