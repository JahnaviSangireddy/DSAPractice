package com.dsapractice.codesignalIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseInParanthesis {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Write a function that reverses characters in (possibly nested) parentheses
    in the input string.

    Input strings will always be well-formed with matching ()s.

    Example

    For inputString = "(bar)", the output should be
    solution(inputString) = "rab";

    For inputString = "foo(bar)baz", the output should be
    solution(inputString) = "foorabbaz";

    For inputString = "foo(bar)baz(blim)", the output should be
    solution(inputString) = "foorabbazmilb";

    For inputString = "foo(bar(baz))blim", the output should be
    solution(inputString) = "foobazrabblim".

    Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
         */

        String s ="foo(bar(baz))blim";
        String output = revInParan(s);
        System.out.println(output);
    }

    private static String revInParan(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(current);
                current = new StringBuilder();
            }else if(c==')'){
                current.reverse();
                current = stack.pop().append(current);
            }else{
                current.append(c);
            }
        }
        return current.toString();
    }
}
