package com.dsapractice.strings;

public class Testing {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("java");
        sb1.deleteCharAt(2);
     //   System.out.println(sb1.toString());
        //###############################################
        String s= "testemail+david@lee.tcode.com";
        int indexOfat = s.indexOf('@');
        String arr[] = s.split("@");
        String s1 = arr[0];
        s1 = s1.replace(".","");
        System.out.println(s1);

        int indexOfplus = s1.indexOf('+');
        StringBuilder sb = new StringBuilder();
        sb.append(s1.substring(0,indexOfplus));
        sb.append("@").append(arr[1]);
        System.out.println(sb);
    }
}
