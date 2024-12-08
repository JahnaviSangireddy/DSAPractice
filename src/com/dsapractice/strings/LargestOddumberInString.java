package com.dsapractice.strings;

public class LargestOddumberInString {
    public static void main(String[] args) {
       // String num = "35427";
       // String num="4206";
        String num="52";
       int start=0; int end=num.length()-1;
       for (int i=0; i<num.length(); i++){
           if(num.charAt(end)%2==0){
               end--;
           }
       }
       String substr = num.substring(start,end+1);
        System.out.println(substr);

    }
}
