package com.dsapractice.codesignalIntro;

public class ValidVariableName {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Correct variable names consist only of English letters, digits and
    underscores and they can't start with a digit.

    Check if the given string is a correct variable name.

    Example

    For name = "var_1__Int", the output should be
    solution(name) = true;

    For name = "qq-q", the output should be
    solution(name) = false;

    For name = "2w2", the output should be
    solution(name) = false.
         */

        String s ="2w2";
        boolean b = checkValidVariableName(s);
        System.out.println(b);
    }

    private static boolean checkValidVariableName(String s) {
        char ch[] = s.toCharArray();
        // 1. first char should not be digit
        //2. shold contain only letters, digits,underscore
        if(Character.isDigit(ch[0])){
            return false;
        }
        for(int i=0; i<s.length();i++){
            if(!Character.isDigit(ch[i]) && !Character.isLetter(ch[i]) && ch[i]!='_'){
                return false;
            }
        }
        return true;
    }
}
