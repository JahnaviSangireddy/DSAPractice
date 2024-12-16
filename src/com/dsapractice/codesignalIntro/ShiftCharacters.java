package com.dsapractice.codesignalIntro;

public class ShiftCharacters {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given a string, your task is to replace each of its characters by the next
    one in the English alphabet; i.e. replace a with b, replace b with c, etc
    (z would be replaced by a).

    Example
    For inputString = "crazy", the output should be
    solution(inputString) = "dsbaz".
         */
        String inp = "crazy";
        String ops = shiftChars(inp);
        System.out.println(ops);
    }

    private static String shiftChars(String inp) {
        char ch[] = inp.toCharArray();
        for(int i=0; i<ch.length;i++){
            if((ch[i] > 'a' || ch[i] > 'A') && (ch[i] < 'z' || ch[i] < 'Z')){
                char c = ch[i];
                ch[i] = (char) (c+1);
            } else if(ch[i] == 'z'){
                ch[i] = 'a';
            }

        }
        return new String(ch);
    }
}
