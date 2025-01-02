package com.dsapractice.strings;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {
        /*
            The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

            P   A   H   N
            A P L S I I G
            Y   I   R
        And then read line by line: "PAHNAPLSIIGYIR"
         */
        String s="PAYPALISHIRING";
        int noOfrows = 3;
        String converted = convertStringtoZigZag(s,noOfrows);
        System.out.println(converted);
    }

    private static String convertStringtoZigZag(String s, int numRows) {

        StringBuilder sb = new StringBuilder();

        List<List<Character>> list = new ArrayList<>();
        int c=0; boolean flag=false;
        for(int i=0; i<numRows; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<s.length(); i++){
            list.get(c).add(s.charAt(i));
            if(c==0 || c==numRows-1){
                flag = !flag;
            }
            if(flag){
                c++;
            }else{
                c--;
            }
        }

        for(List<Character> charlist : list){
            for(char ch : charlist){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
