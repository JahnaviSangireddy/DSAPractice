package com.dsapractice.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        /*
            A
            A B
            A B C
            A B C D
            A B C D E
         */
        int n=5; char c = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c++ +"");
            }
            System.out.println();
            c='A';
        }
    }
}
