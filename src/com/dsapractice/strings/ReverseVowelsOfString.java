package com.dsapractice.strings;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        /*
        Given a string s, reverse only all the vowels in the string and return it.
        Input: s = "IceCreAm"
        Output: "AceCreIm"
         */
        String s="IceCreAm";
        String revVowels = reverseVowels(s);
        System.out.println(revVowels);
    }

    private static String reverseVowels(String s) {
        int i=0; int j=s.length()-1;
        while(i<j){
            char c1= s.charAt(i);
            System.out.println(c1+" : "+isVowel(c1));
            if(isVowel(c1)){
                char c2= s.charAt(j);
                if(isVowel(c2)){
                    char t = c1;
                    s.replaceFirst(c1+"",c2+"");
                    s.replaceFirst(c2+"",t+"");
                    i++; j--;
                }else{
                    j--;
                }
            }else {
                i++;
            }
        }
        return s;
    }

    private static boolean isVowel(char c1) {
        if(c1 == 'a' || c1=='A' ||
            c1 == 'e' || c1 == 'E' ||
                c1 == 'i' || c1 == 'I' ||
                c1 == 'o' || c1 == 'O' ||
                c1 == 'u' || c1 == 'U'){
            return true;
        }else {
            return false;
        }
    }
}
