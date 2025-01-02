package com.dsapractice.codesignalIntro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        /*
          Problem
    --------------------------------------------------------------------------------
    CodeMaster has just returned from shopping. He scanned the check of the
    items he bought and gave the resulting string to Ratiorg to figure out the
    total number of purchased items. Since Ratiorg is a bot he is definitely
    going to automate it, so he needs a program that sums up all the numbers
    which appear in the given input.

    Help Ratiorg by writing a function that returns the sum of numbers that
    appear in the given inputString.

    Example

    For inputString = "2 apples, 12 oranges", the output should be
    solution(inputString) = 14.
         */

        String str="2 apples, 12 oranges";
        int sum = sumUpNumbers(str);
        System.out.println(sum);
    }

    private static int sumUpNumbers(String str) {

        int sum=0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            sum=sum+Integer.parseInt(matcher.group());
        }
        return sum;
    }
}
