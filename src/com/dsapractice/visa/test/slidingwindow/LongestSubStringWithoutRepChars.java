package com.dsapractice.visa.test.slidingwindow;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class LongestSubStringWithoutRepChars {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int lenOfLongestSunstr = findLength(s);
        System.out.println(lenOfLongestSunstr);
    }

    private static int findLength(String s) {
        int st=0, end=0, len=0, maxlen=0;
        Set<Character> set = new HashSet<>();
        while(end<s.length()){
            char curr = s.charAt(end);
            if(set.contains(curr)){
                st++;
            }else{
                set.add(curr);
                len = end-st+1;
                maxlen = max(len,maxlen);
            }
            end++;
        }
        return maxlen;
    }
}
