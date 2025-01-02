package com.dsapractice.arrayPairingAndMatching;

import java.util.HashSet;
import java.util.Set;

public class AlternateCharString {
    public static void main(String[] args) {
        /*
        Input: "beabeefeab"
        output : 5
        it should be reduced to "babab". (remove all chars that will make string contain
         2 distict characters and are alternatingwithin the string.

         */
        String inp = "beabeefeab";
        String inp1 = "asdcbsdcagfsdbgdfanfghbsfdab";
        int maxlen = findAlternateCharStr(inp1);
        System.out.println(maxlen);

    }

    private static int findAlternateCharStr(String inp) {
        int maxlen = 0;
        Set<Character> uniqchars = new HashSet<>();
        for(int i=0; i<inp.length(); i++){
            uniqchars.add(inp.charAt(i));
        }
        Character[] uniqcharsarr = uniqchars.toArray(new Character[0]);
        for(int i=0; i<uniqcharsarr.length; i++){
            for(int j=i+1; j<uniqcharsarr.length; j++){
                String s = filterStr(inp,uniqcharsarr[i], uniqcharsarr[j]);
                if(isValidAltStr(s)){
                    int len = s.length();
                    maxlen = Math.max(len,maxlen);
                }
            }
        }
        return maxlen;
    }

    private static boolean isValidAltStr(String s) {

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    private static String filterStr(String inp, Character ch1, Character ch2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i) == ch1 || inp.charAt(i) == ch2){
                sb.append(inp.charAt(i));
            }
        }
        return sb.toString();
    }

}
