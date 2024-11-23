package com.dsapractice.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        /*
            E
            D E
            C D E
            B C D E
            A B C D E
         */
        int n=5; char c='E';
        for(int i=0; i<n; i++){
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
