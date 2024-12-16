package com.dsapractice.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="MCMXCIV";
        int res = convertRomanToInteger(s);
        System.out.println(res);
    }

    private static int convertRomanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; int curval=0; int nextval=0;

        for(int i=0; i<s.length();i++){
            curval = romanMap.get(s.charAt(i));
            if(i<s.length()-1 && curval<romanMap.get(s.charAt(i+1))){
                result = result-curval;
            }else{
                result = result+curval;
            }
        }
        return result;
    }
}
