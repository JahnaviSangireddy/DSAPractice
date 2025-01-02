package com.dsapractice.stacks;

import java.nio.charset.Charset;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        /*
        Given an encoded string, return its decoded string.

        The encoding rule is: k[encoded_string], where the encoded_string inside the
        square brackets is being repeated exactly k times. Note that k is guaranteed to
        be a positive integer.

        Example 1:

        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"
        Example 2:

        Input: s = "3[a2[c]]"
        Output: "accaccacc"
        Example 3:

        Input: s = "2[abc]3[cd]ef"
        Output: "abcabccdcdcdef"
         */

        String input = "3[a]2[bc]";
        String output =  decodeTheString(input);
        System.out.println(output);
    }

    private static String decodeTheString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the multiplier
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current multiplier and string onto their respective stacks
                countStack.push(k);
                resultStack.push(currentString);
                currentString = new StringBuilder();
                k = 0; // Reset the multiplier
            } else if (ch == ']') {
                // Pop the multiplier and previous string
                int repeatTimes = countStack.pop();
                StringBuilder temp = currentString;
                currentString = resultStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    currentString.append(temp);
                }
            } else {
                // Append characters to the current string
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}
