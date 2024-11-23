package com.dsapractice.patterns;

public class Pattern5 {

    public static void main(String[] args) {
        /*
            12345
            1234
            123
            12
            1
         */

        int noOfRows=5;
        for(int i=0;i<=noOfRows;i++){
            for(int j=1; j<=(noOfRows-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
