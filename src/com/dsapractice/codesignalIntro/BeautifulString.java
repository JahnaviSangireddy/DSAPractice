package com.dsapractice.codesignalIntro;

import java.util.HashMap;
import java.util.Map;

public class BeautifulString {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    A string is said to be beautiful if each letter in the string appears at
    most as many times as the previous letter in the alphabet within the
    string; ie: 'b' occurs no more times than 'a'; 'c' occurs no more times than
    'b'; etc. Note that letter 'a' has no previous letter.

    Given a string, check whether it is beautiful.

    Example

    For inputString = "bbbaacdafe", the output should be
    solution(inputString) = true.

    This string contains 3 'a's, 3 'b's, 1 'c', 1 'd', 1 'e', and 1 'f'
    (and 0 of every other letter), so since there aren't any letters that appear
    more frequently than the previous letter, this string qualifies as beautiful.

    For inputString = "aabbb", the output should be
    solution(inputString) = false.

    Since there are more 'b's than 'a's, this string is not beautiful.

    For inputString = "bbc", the output should be solution(inputString) = false.

    Although there are more 'b's than 'c's, this string is not beautiful because
    there are no 'a's, so therefore there are more 'b's than 'a's.
         */

        String s="bbbaacdafe";
        boolean isBeautiful = checkString(s);
        System.out.println(isBeautiful);
    }

    private static boolean checkString(String s) {
        Map<Character,Integer> countMap = new HashMap<>();
        for(char c : s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

        char st='a', end='z';
        int prevcount=0, currcount=0;
        while(st<end){
            if(countMap.containsKey(st)){
                currcount = countMap.get(st);
                if(st=='a'){
                    prevcount = currcount;
                }
                if(currcount>prevcount){
                    return false;
                }
            }
            prevcount = currcount;
            st = (char) (st+1);
        }
        return true;
    }
}
