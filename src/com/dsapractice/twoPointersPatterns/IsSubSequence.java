package com.dsapractice.twoPointersPatterns;

public class IsSubSequence {
    public static void main(String[] args) {
        String s="bcd";
        String t= "uuuuuuuuuuuuuuuuuuuuuuuuubcd";
        boolean b = isSubSequence(s,t);
        System.out.println(b);
    }

    private static boolean isSubSequence(String s, String t) {
        int sIndex=0; int tIndex=0;
        while(sIndex<s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }
        if(sIndex<s.length()){
            return false;
        }
        return true;
    }
}
