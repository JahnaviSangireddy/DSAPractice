package com.dsapractice.patterns;

public class Pattern1 {
  /*

    *
    **
    ***
    ****
    *****

   */

    public static void main(String[] args) {
        int noOfRows=5;
        for(int i=0; i < noOfRows;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
