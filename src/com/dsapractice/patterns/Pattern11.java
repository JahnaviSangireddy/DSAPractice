package com.dsapractice.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        /*
            A
            B B
            C C C
            D D D D
            E E E E E
         */
        int n=5; char c='A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }
}
