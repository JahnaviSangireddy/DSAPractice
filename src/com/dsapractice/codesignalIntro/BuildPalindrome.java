package com.dsapractice.codesignalIntro;

public class BuildPalindrome {
    /*
     Problem
    --------------------------------------------------------------------------------
    Given a string, find the shortest possible string which can be achieved by
    adding characters to the end of initial string to make it a palindrome.

    Example

    For st = "abcdc", the output should be
    solution(st) = "abcdcba".
     */
    public static void main(String[] args) {
        String st="abcdc";
        String palinSt = findPalindromeString(st);
        System.out.println(palinSt);
    }

    private static String findPalindromeString(String st) {
        int start=0; int end=0;
        StringBuilder s = new StringBuilder(st);
        boolean b = false;
        while(!b){
           b= checkPalindromeString(s.substring(start));
           start++;
        }
        end=start-1;
        StringBuilder sub = new StringBuilder(s.substring(0, end));

        s.append(sub.reverse());
        return s.toString();
    }

    private static boolean checkPalindromeString(String s) {
        System.out.println(s);
        int st=0, end=s.length()-1;
        while (st<end){
            if(s.charAt(st) != s.charAt(end)){
               return false;
            }
            st++; end--;
        }
        return true;
    }

}
