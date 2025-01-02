package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class FindPalindromePairs {
    public static void main(String[] args) {
        /*
        **Find All Palindrome Pairs**
   - Given an array of words, find all pairs of indices `(i, j)` such that the concatenation of words[i] and words[j] forms a palindrome.
   - Example: `Input: ["bat", "tab", "cat"]` → `Output: [(0, 1), (1, 0)]`
         */
        String[] input = {"bat", "tab", "cat"};
        List<int[]> list = findPalindromePairs(input);
        for(int[] arr : list){
            System.out.println("("+arr[0]+","+arr[1]+")");
        }
    }

    private static List<int[]> findPalindromePairs(String[] input) {
        List<int[]> res = new ArrayList<>();
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input.length; j++){
                if(i==j){
                    continue;
                }
                String s = input[i]+input[j];
                if(isPalindrome(s)){
                    res.add(new int[]{i,j});
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s){
        int st=0, end=s.length()-1;
        while (st<end){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
