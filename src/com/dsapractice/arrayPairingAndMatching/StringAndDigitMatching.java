package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class StringAndDigitMatching {
    public static void main(String[] args) {
        /*
        **Digit Transformation Pairs**
   - Given a list of numbers, find pairs where one number can be transformed into the other by replacing one digit.
   - Example: `Input: [123, 223, 323, 333]` → `Output: [(123, 223), (223, 323)]`
         */
        int[] input = {123, 223, 323, 333};
        List<int[]> output = findPairsByMatchingDigits(input);
        for(int[] res : output){
            System.out.println("("+res[0]+","+res[1]+")");
        }
    }

    private static List<int[]> findPairsByMatchingDigits(int[] input) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                if(isValidPair(input[i],input[j])){
                    list.add(new int[]{input[i],input[j]});
                }
            }
        }
        return list;
    }

    private static boolean isValidPair(int i, int i1) {
        String s1= String.valueOf(i);
        String s2 = String.valueOf(i1);
    //    System.out.println(s1+", "+s2);
        if(s1.length() != s2.length()){
            return false;
        }
        int j=0, k=0, mismatch=0;
        for(j=0; j<s1.length(); j++){
            if(s1.charAt(j) != s2.charAt(j)){
                mismatch++;
            }
            if(mismatch >1){
                return false;
            }
        }
        return true;
    }
}
