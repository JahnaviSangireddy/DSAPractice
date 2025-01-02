package com.dsapractice.strings;

import java.util.ArrayList;
import java.util.List;

public class RemoveOuterParantheses {
    public static void main(String[] args) {
        /*
        A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation:
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
         */
        String input ="(()())(())(()(()))";
        String output = removeOuterParantheses(input);
        System.out.println(output);
    }

    private static String removeOuterParantheses(String input) {
        char inparr[] = input.toCharArray();
        String res = new String();
        StringBuilder sb = new StringBuilder();
        int st=0; int cop=0; int i=0;
        while(i<input.length()){
            if(inparr[i] == '('){
                cop++;
            }else if(inparr[i]==')'){
                cop--;
            }
            if(cop == 0){
                sb.append(input.substring(st,i+1));
                String s= sb.substring(1,sb.length()-1).toString();
                res = res+s;

                st=i+1;
                sb=new StringBuilder();
            }
            i++;

        }
        return res;
    }
}
