package com.dsapractice.strings;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="pqrstuv";
        String merged = mergeStrings(s1,s2);
        System.out.println(merged);
    }

    private static String mergeStrings(String s1, String s2) {
        String merged=""; int i=0;
        for(i=0;i<s1.length();i++){
            merged=merged+s1.charAt(i)+s2.charAt(i);
        }
        if(s2.length()>i){
            for (int j=i;j<s2.length();j++){
                merged=merged+s2.charAt(j);
            }
        }
        return merged;
    }
}
