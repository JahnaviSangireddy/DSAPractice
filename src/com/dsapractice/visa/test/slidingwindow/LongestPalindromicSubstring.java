package com.dsapractice.visa.test.slidingwindow;

import static java.lang.Math.max;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String longPalindromeicSubString = findLongestPalinSubstr(s);
        System.out.println(longPalindromeicSubString);
    }

    private static String findLongestPalinSubstr(String s) {
        int maxlen=0; String res="";
       for(int i=0; i<s.length(); i++){
           for(int j=i; j<s.length(); j++){
               String substr = s.substring(i,j+1);
              if(isPalindrome(substr)){
                  if(substr.length() > maxlen){
                      maxlen = substr.length();
                      res = substr;
                  }
              }
           }
       }
        return res;
    }

    private static boolean isPalindrome(String s){
        int st=0, end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++; end--;
        }
        return true;
    }
}
