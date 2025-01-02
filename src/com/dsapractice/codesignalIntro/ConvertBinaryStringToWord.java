package com.dsapractice.codesignalIntro;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryStringToWord {
    public static void main(String[] args) {
        String code = "010010000110010101101100011011000110111100100001";
        String word = convertToWord(code);
        System.out.println(word);
    }

    private static String convertToWord(String code) {
        StringBuilder word = new StringBuilder();

        int i=0, j=0;
        for(i=0; i<code.length(); i=i+8){
            StringBuilder sb = new StringBuilder();
          for(j=i; j<i+8;j++){
              sb.append(code.charAt(j));
          }
          int num = Integer.parseInt(sb.toString(),2);
          char c = (char)num;
          word.append(c);
        }
        return word.toString();
    }
}
