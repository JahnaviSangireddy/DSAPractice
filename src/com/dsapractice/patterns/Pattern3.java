package com.dsapractice.patterns;

public class Pattern3 {

    /*
        1
        22
        333
        4444
        55555
     */
    public static void main(String[] args) {
        int noOfRows = 5;
        for(int i=1;i<=noOfRows; i++){
            for(int j=1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
