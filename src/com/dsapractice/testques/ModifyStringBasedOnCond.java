package com.dsapractice.testques;

public class ModifyStringBasedOnCond {
    public static void main(String[] args) {
        String arr[] = {"Hello","this","is","a","test"};
        String modified[] = getModifiedStrings(arr);
        for(String s : modified){
            System.out.println(s);
        }
    }

    private static String[] getModifiedStrings(String[] arr) {

        for(int i=0; i<arr.length; i++){
            if(arr[i].length()%2 == 0){
                String s = reverseString(arr[i]);
                arr[i] = s;
            }else{
                String s = arr[i].toUpperCase();
                arr[i] = s;
            }

        }
        return arr;
    }

    private static String reverseString(String s) {
        int st=0, end=s.length()-1;
        char ch [] = s.toCharArray();
        while(st<end){
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++; end--;
        }
        return new String(ch);
    }
}
