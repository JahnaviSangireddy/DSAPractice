package com.dsapractice.codesignalIntro;

public class DigitDegree {
    public static void main(String[] args) {
        /*
          Problem
    --------------------------------------------------------------------------------
    Let's define digit degree of some positive integer as the number of times we
    need to replace this number with the sum of its digits until we get to a one
    digit number.

    Given an integer, find its digit degree.

    Example

    For n = 5, the output should be
    solution(n) = 0;

    For n = 100, the output should be
    solution(n) = 1.
    1 + 0 + 0 = 1.

    For n = 91, the output should be
    solution(n) = 2.
    9 + 1 = 10 -> 1 + 0 = 1.
         */
        int n=555;
        int singledig= finddigit(n);
        System.out.println(singledig);
    }

    private static int finddigit(int n) {
        int s=0;
        while(n>9){
          s =  findDigitSum(n);
          n = s;
        }
        return n;
    }

    private static int findDigitSum(int n) {
        int sum=0;
        while(n>0){
            int dig = n%10;
            sum = sum+dig;
            n=n/10;
        }
        return sum;
    }
}
