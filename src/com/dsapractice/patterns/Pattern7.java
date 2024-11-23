package com.dsapractice.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*
            *********
             *******
              *****
               ***
                *
         */

        int noOfRows =5;
        for(int i=0; i<(2*noOfRows)-1; i++){
            for(int j=0; j<(2*noOfRows)-1; j++){
                if(i-j >0 || i+j>=9){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
