package com.dsapractice.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s="the sky is blue";
        String rev = reverseString(s);
        System.out.println(rev);
    }

    private static String reverseString(String s) {
        String words[] = s.split(" ");
        StringBuilder strb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            strb.append(words[i]).append(" ");
        }
       return  strb.toString().trim();
    }

}
