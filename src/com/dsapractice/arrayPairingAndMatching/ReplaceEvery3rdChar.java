package com.dsapractice.arrayPairingAndMatching;

public class ReplaceEvery3rdChar {
    public static void main(String[] args) {
        /*
        given a string replace every third consonant with its next letter..
        input: s="HelloWorld";
                  0123456789
         */

        String s = "HelloWorld";
        String replaced = findReplacedString(s);
        System.out.println(replaced);
    }

    private static String findReplacedString(String s) {
        char ch[] = s.toCharArray();
        int count=1;
        for(int i=0; i<s.length(); i++){
            if(count==3){
                System.out.println(s.charAt(i));
                char c = 0;
                if(Character.isLowerCase(s.charAt(i))){
                     c= (char)((s.charAt(i)-'a'+1)%26+'a');
                }else if(Character.isUpperCase(s.charAt(i))){
                    c= (char)((s.charAt(i)-'A'+1)%26+'A');
                }
                ch[i] = c;
                count=0;
            }
            count++;
        }
        return  new String(ch);
    }
}
