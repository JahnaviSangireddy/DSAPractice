package com.dsapractice.stacks;

import java.util.Arrays;
import java.util.Stack;

public class RemoveleftCharAndStar {
    public static void main(String[] args) {
        /*
        You are given a string s, which contains stars *.

        In one operation, you can:

        Choose a star in s.
        Remove the closest non-star character to its left, as well as remove the star itself.
        Return the string after all stars have been removed.

        Input: s = "leet**cod*e"
        Output: "lecoe"
         */

        String input = "leet**cod*e";
        String out = findNonStarStr(input);
        System.out.println(out);
    }

    private static String findNonStarStr(String input) {
        Stack<Character> stk = new Stack<>();
        for(char c : input.toCharArray()){
            if(c=='*'){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        StringBuilder st = new StringBuilder();
        while(!stk.isEmpty()){
            st =st.insert(0, stk.pop());
        }

        return st.toString();
    }
}
