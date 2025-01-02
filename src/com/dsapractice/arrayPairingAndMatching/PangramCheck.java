package com.dsapractice.arrayPairingAndMatching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        /*
        s="We promptly judged antique ivory buckles for the prize"
        if s contains all letters from a-z its a pangram.
         */
        String s="We promptly judged antique ivory buckles for the next prize";
        String res = checkIfPangram(s);
        System.out.println(res);
    }

    private static String checkIfPangram(String s) {
        Set<Character> uniqset = new HashSet<>();
        s= s.toLowerCase();
        s = s.replaceAll("[^a-z]","");
        for(char c : s.toCharArray()){
            uniqset.add(c);
        }
        if(uniqset.size() == 26){
            return "pangram";
        }else{
            return "not pangram";
        }
    }
}
