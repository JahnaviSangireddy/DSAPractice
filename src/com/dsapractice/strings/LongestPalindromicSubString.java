package com.dsapractice.strings;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s="babbad";
        String substr = longestPalindromicSubString(s);
        System.out.println(substr);
    }

    private static String longestPalindromicSubString(String s) {
        String longest=""; int maxlen=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String substr = s.substring(i,j+1);
                if(isPalindrome(substr)){
                    if(substr.length() > maxlen){
                        maxlen = substr.length();
                        longest = substr;
                    }
                }
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String str){
        int st=0; int end= str.length()-1;
        while(st<end){
            if(!(str.charAt(st) == str.charAt(end))){
                return false;
            }
            st++; end--;
        }
        return true;
    }
}
