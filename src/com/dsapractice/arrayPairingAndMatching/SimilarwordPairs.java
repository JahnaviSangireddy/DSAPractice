package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class SimilarwordPairs {
    public static void main(String[] args) {
        /*
        **Similar Words with One Letter Difference**
   - Find all pairs of words where exactly one letter differs between the two.
   - Example: `Input: ["abc", "abd", "bbc", "xyz"]` → `Output: [(abc, abd), (abc, bbc)]
         */
        String input[] = {"abc", "abd", "bbc", "xyz"};
        List<String[]> output = findSimilarWordPairs(input);
        for(String[] arr : output){
            System.out.println("("+arr[0]+","+arr[1]+")");
        }
    }

    private static List<String[]> findSimilarWordPairs(String[] input) {
        List<String[]> list = new ArrayList<>();
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                if(isValidSimilarWordPair(input[i],input[j])){
                    list.add(new String[]{input[i], input[j]});
                }
            }
        }
        return list;
    }

    private static boolean isValidSimilarWordPair(String s, String s1) {
        int mismatch=0;
        for(int i=0; i<s1.length(); i++){
            if(s.charAt(i)!=s1.charAt(i)){
                mismatch++;
            }
            if(mismatch>1){
                return false;
            }
        }
        return true;
    }
}
