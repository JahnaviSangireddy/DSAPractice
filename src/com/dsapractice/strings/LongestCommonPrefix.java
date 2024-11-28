package com.dsapractice.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"geeks","geeksforgeeks","geetha arts"};
        String longestCommonPrefix = findLongestCommonPrefix(strs);
        System.out.println(longestCommonPrefix);
    }

    private static String findLongestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first =strs[0];
        String last = strs[strs.length-1];
        int i=0,j=0;
        while(i<first.length() && i<last.length()){
            if(first.charAt(i) == last.charAt(i)){
                j++;
            }
            i++;
        }
        String commonPrefix = last.substring(0,j);
        return commonPrefix;
    }
}
