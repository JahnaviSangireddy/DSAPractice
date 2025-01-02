package com.dsapractice.strings;

import java.util.HashSet;
import java.util.Set;


public class ReverseVowelOfStringNew {
    public static void main(String[] args) {
         /*
        Given a string s, reverse only all the vowels in the string and return it.
        Input: s = "IceCreAm"
        Output: "AceCreIm"
         */
        String s="IceCreAm";
        String revVowels = reverseVowelsNew(s);
        System.out.println(revVowels);
    }

    private static String reverseVowelsNew(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('A');
        vowels.add('e'); vowels.add('E');
        vowels.add('i'); vowels.add('I');
        vowels.add('o'); vowels.add('O');
        vowels.add('u'); vowels.add('U');

        int st=0; int end=s.length()-1;
        char ch[] = s.toCharArray();
        while(st<end){
            while (st<end && !vowels.contains(ch[st])){
                st++;
            }
            while(st<end && !vowels.contains(ch[end])){
                end--;
            }
            char t = ch[st];
            ch[st] = ch[end];
            ch[end]=t;
            st++;
            end--;
        }
        return new String(ch);
    }
}
