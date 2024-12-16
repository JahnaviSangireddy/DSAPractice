package com.dsapractice.codesignalIntro;

public class EvenDigitsCheck {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Check if all digits of the given integer are even.

    Example

    For n = 248622, the output should be
    solution(n) = true;

    For n = 642386, the output should be
    solution(n) = false.
         */
        int num = 248422;
        boolean valid = checkAllDigitsEven(num);
        System.out.println(valid);
    }

    private static boolean checkAllDigitsEven(int num) {
        while(num!=0){
            int dig = num%10;
            num = num/10;
            if(dig%2 !=0){
                return false;
            }
        }
        return true;
    }
}
