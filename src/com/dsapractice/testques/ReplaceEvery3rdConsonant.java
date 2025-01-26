package com.dsapractice.testques;

import static com.dsapractice.strings.MaxNoOfVowels.isVowel;

public class ReplaceEvery3rdConsonant {
    public static void main(String[] args) {
        String s="HelloWorldThisIsCodeSignalTest";
        String rep = replaceString(s);
        System.out.println(rep);
    }

    private static String replaceString(String s) {
        int count=1;
        char ch[] = s.toCharArray();
        for(int i=0; i<s.length();i++){
            if(count==3 && !isVowel(s.charAt(i))){
                char c =0;
                if(Character.isLowerCase(s.charAt(i))){
                    c= (char)((s.charAt(i)-'a'+1)%26+'a');
                }else if(Character.isUpperCase(s.charAt(i))){
                    c= (char)((s.charAt(i)-'A'+1)%26+'A');
                }
                ch[i]=c;
                count=0;
            }
            if(count==3){
                count=0;
            }
            count++;
        }
        return new String(ch);
    }

    private static void replaceWithNextLetter(String s, int i) {
        char c = s.charAt(i);
        if(Character.isLowerCase(c)){
            c = (char) ((c-'a'+1)%26+'a');
        }
    }

}
