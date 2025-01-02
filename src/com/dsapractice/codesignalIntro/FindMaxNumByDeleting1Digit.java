package com.dsapractice.codesignalIntro;

import static java.lang.Math.max;

public class FindMaxNumByDeleting1Digit {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given some integer, find the maximal number you can obtain by deleting
    exactly one digit of the given number.

    Example

    For n = 152, the output should be solution(n) = 52;
    For n = 1001, the output should be solution(n) = 101.
         */

        int n=1582;
        int max = findMaxByDeleteing1Digit(n);
        System.out.println(max);
    }

    private static int findMaxByDeleteing1Digit(int n) {
        int maxel=0;
        String s = Integer.toString(n);

        for(int i=0; i<s.length();i++){
            StringBuilder sb = new StringBuilder(s);
            sb= sb.deleteCharAt(i);
            int elm = Integer.parseInt(sb.toString());
            maxel = max(elm, maxel);
        }
        return maxel;
    }
}
