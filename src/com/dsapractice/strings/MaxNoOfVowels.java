package com.dsapractice.strings;

import static java.lang.Math.max;

public class MaxNoOfVowels {
    /*
    find the length of substring which contains max no of vowels. substring length must be k
    ex: s="abciiidef" ,k =3;
    substrs are [abc, bci, cii, iii, iid, ide,def]
     */
    public static void main(String[] args) {
        String s="abciiidef"; int k=3;
        int st=0, end=k; int maxvowels = 0;
        for(int i=0; i<s.length()-k+1; i++){
            String substr= s.substring(st,end);
            System.out.println(substr);
            int count=0;
            substr = substr.toLowerCase();
            for(char c : substr.toCharArray()){
                if(isVowel(c)){
                    count++;
                }
            }
            maxvowels = max(maxvowels,count);
            st++; end++;
        }
        System.out.println(maxvowels);
    }

   public  static boolean isVowel(char c){
        if(c == 'a' || c=='e' || c== 'i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}
