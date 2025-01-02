package com.dsapractice.strings;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class LongestSubStringWithotRepeatingChars {
    public static void main(String[] args) {
        /*
        Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
         */
        String s = "abcabcbb";
        int length = findLengthOfLongestSubstring(s);
        System.out.println(length);
    }

    private static int findLengthOfLongestSubstring(String s) {
        StringBuilder sub = new StringBuilder();
        Set<Character> set = new HashSet<>() ;
        int maxlength = 0; int left=0, right=0;
        char ch[] = s.toCharArray();
        for(right=0; right<s.length(); right++){
            char curr = s.charAt(right);
            System.out.println("curr "+curr);
            while(set.contains(curr)){
                System.out.println("removing "+s.charAt(left));
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            maxlength = max(maxlength,right-left +1);
            System.out.println(maxlength);
        }

        return maxlength;
    }
}
