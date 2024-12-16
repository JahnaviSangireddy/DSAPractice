package com.dsapractice.codesignalIntro;

public class LongestDigitPrefix {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given a string, output its longest prefix which contains only digits.

    Example

    For inputString = "123aa1", the output should be
    solution(inputString) = "123".
         */
        String s ="123456aa1";
        String longprefix = findprefix(s);
        System.out.println(longprefix);
    }

    private static String findprefix(String s) {
        int endIndex=0;
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                continue;
            }else{
                endIndex=i-1;
            }
        }
        return s.substring(0,endIndex);
    }
}
