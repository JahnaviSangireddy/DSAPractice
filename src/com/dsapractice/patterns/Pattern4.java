package com.dsapractice.patterns;

public class Pattern4 {
    /*
        *****
        ****
        ***
        **
        *
     */
    public static void main(String[] args) {
        int noOfRows=5;
        for(int i=noOfRows;i>0;i--){
            for(int j=i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
