package com.dsapractice.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        /*
             9 7 5 3 1
                 *
                ***
               *****
              *******
             *********
         */

        int noOfRows=5;
        for(int i=0;i<noOfRows;i++){
            for(int j=0; j<(2*noOfRows)-1; j++){
                if((i+j >=noOfRows-1) && (j-i <=noOfRows-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
