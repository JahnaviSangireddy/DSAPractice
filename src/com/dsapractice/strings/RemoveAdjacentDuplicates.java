package com.dsapractice.strings;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        /*
        You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
and this is the only possible move.
The result of this move is that the string is "aaca", of which only "aa" is possible,
so the final string is "ca".
         */
        String s="abbaca";
        String unq = removeadjduplicates(s);
        System.out.println(unq);
    }

    //abbaca

    private static String removeadjduplicates(String s) {
        StringBuilder sb = new StringBuilder(" ");
        for(char c : s.toCharArray()){
            if(sb.length()>=1 && sb.charAt(sb.length()-1) == c){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
