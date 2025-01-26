package com.dsapractice.visa.test;

public class ReplaceEvery3rdConsonant {
    public static void main(String[] args) {
        String str = "abcdefg";
        String repstr = replace3rdConsonant(str);
        System.out.println(repstr);
    }

    private static String replace3rdConsonant(String str) {
        int count=0;
        char ch[] = str.toCharArray();
        for(int i=0; i<str.length(); i++){

                char c = str.charAt(i);
                if(NotVowel(c)){
                    count++;
                    if(count==3) {
                        //  c = (char) ((c-'a'+1)%26+'a');
                        c = (char) (c + 1);
                        ch[i] = c;
                        count=0;
                    }
                }
        }
        return new String(ch);
    }

    private static boolean NotVowel(char c) {
        if(c!='a' || c!='e' || c!='i' || c!='o' || c!='u' ||
                c!='A' || c!='E' || c!='I' || c!='O' || c!='U' ){
            return true;
        }
        return false;
    }
}
