package com.dsapractice.codesignalIntro;

public class FindFirstDigitInString {
    public static void main(String[] args) {
        /*
        Problem
    --------------------------------------------------------------------------------
    Find the leftmost digit that occurs in a given string.
    
    Example
    
    For inputString = "var_1__Int", the output should be
    solution(inputString) = '1';
    
    For inputString = "q2q-q", the output should be
    solution(inputString) = '2';
    
    For inputString = "0ss", the output should be
    solution(inputString) = '0'.
         */
        String str = "var_1__Int";
        char firstDigit = findFirstDigit(str);
        System.out.println(firstDigit);
    }

    private static char findFirstDigit(String str) {
        char firstdig = 0;
        char ch[] = str.toCharArray();
        for(char c : ch){
            if(Character.isDigit(c)){
                firstdig=c;
                break;
            }
        }
        return firstdig;
    }
}
