package com.dsapractice.codesignalIntro;

import static java.lang.Math.min;

public class SmallestProduct {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given an integer product, find the smallest positive (i.e. greater than 0)
    integer the product of whose digits is equal to product. If there is no such
    integer, return -1 instead.

    Example

    For product = 12, the output should be solution(product) = 26;
    For product = 19, the output should be solution(product) = -1.
         */

        int product = 12;
        int smallestdivisor = findSmallestdivisorDigits(product);
        System.out.println(smallestdivisor);
    }

    private static int findSmallestdivisorDigits(int product) {
        int min=Integer.MAX_VALUE;
      //  System.out.println(isPrime(55));
        if(isPrime(product)){
            min = -1;
        }
        for(int i=2; i<=9;i++){
            if(product%i == 0){
                int val = (i*10) + product/i;
                min = min(min,val);
            }
        }
        return min;
    }

    private static boolean isPrime(int product) {
        for(int i=2; i<product-1; i++){

            if(product%i ==0 ){
                return false;
            }
        }
        return true;
    }
}
