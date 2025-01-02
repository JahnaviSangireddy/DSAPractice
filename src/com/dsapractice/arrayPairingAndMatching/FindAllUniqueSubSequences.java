package com.dsapractice.arrayPairingAndMatching;

import java.util.*;

public class FindAllUniqueSubSequences {
    /*
    **Find All Unique Subsequences**
    - Given a string, find all unique subsequences of it.
    - Example: `Input: "abc"` → `Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]`

     */
    public static void main(String[] args) {
        String input="abc";
        Set<String> set = findSubsequences(input);
        for(String s : set){
            System.out.print(s+" ");
        }

    }

    private static Set<String> findSubsequences(String input) {
        char ch[] = input.toCharArray();
        Set<String> set = new HashSet<>();
        set.add("");
        for(char s: input.toCharArray()){
            set.add(s+"");
        }
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                String subseq = ch[i]+""+ch[j]+"";
                set.add(subseq);
            }
        }
        set.add(input);
        return set;
    }
}
