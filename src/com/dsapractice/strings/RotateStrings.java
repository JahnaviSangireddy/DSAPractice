package com.dsapractice.strings;

public class RotateStrings {
    public static void main(String[] args) {
        /*
            Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

    A shift on s consists of moving the leftmost character of s to the rightmost position.

    For example, if s = "abcde", then it will be "bcdea" after one shift.
         */

        String input="abcde";
        String goal="cdeab";
        boolean b = rotateStringCheck(input,goal);
        System.out.println(b);
    }

    private static boolean rotateStringCheck(String input, String goal) {
        String ip= input;
        boolean check=false;
        for(int i=0; i< input.length();i++){
            char c = input.charAt(i);
            ip= ip.substring(1,ip.length())+c;
            System.out.println(ip);
            if(goal.equals(ip)){
                check = true;
                break;
            }
        }
        return check;
    }
}
