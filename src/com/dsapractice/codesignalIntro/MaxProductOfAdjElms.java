package com.dsapractice.codesignalIntro;

public class MaxProductOfAdjElms {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given an array of integers, find the pair of adjacent elements that has the
    largest product and return that product.

    Example

    For inputArray = [3, 6, -2, -5, 7, 3], the output should be
    solution(inputArray) = 21.

    7 and 3 produce the largest product.
         */

        int arr[] = {3, 6, -2, -5, 7, 3};
        int maxprod = findMaxProd(arr);
        System.out.println(maxprod);
    }

    private static int findMaxProd(int[] arr) {
        int maxprod =1;
        for(int i=0;i<arr.length-1;i=i+2){
            int currprod = arr[i] * arr[i+1];
            if(currprod > maxprod){
                maxprod = currprod;
            }
        }
        return maxprod;
    }
}
