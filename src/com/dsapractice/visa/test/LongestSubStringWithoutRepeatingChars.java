package com.dsapractice.visa.test;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {
        String str="abcabcbb";
        int maxlen = FindLongestSubString(str);
        System.out.println(maxlen);
    }

    private static int FindLongestSubString(String str) {
        Set<Character> set = new HashSet<>();
        int st=0, end=0, len=0, maxlen=0;
        while(end<str.length()){
            char c = str.charAt(end);
            while(set.contains(c)){

                set.remove(str.charAt(st));
                st++;
            }
            set.add(str.charAt(end));
            len = end-st+1;
            maxlen = max(len,maxlen);

            end++;
        }
        return maxlen;
    }
}
