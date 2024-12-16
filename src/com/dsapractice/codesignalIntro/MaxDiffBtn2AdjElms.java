package com.dsapractice.codesignalIntro;

public class MaxDiffBtn2AdjElms {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given an array of integers, find the maximal absolute difference between
    any two of its adjacent elements.

    Example

    For inputArray = [2, 4, 1, 0], the output should be
    solution(inputArray) = 3.
         */
        int arr[] = {2, 4, 1, 0,4};
        int maxdiff = maxDiffOfAdjElmns(arr);
        System.out.println(maxdiff);
    }

    private static int maxDiffOfAdjElmns(int[] arr) {
        int maxdif = 0; int diff=0;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                diff = arr[i] - arr[i+1];
            }else{
                diff = arr[i+1] - arr[i];
            }
            if(diff > maxdif){
                maxdif = diff;
            }
        }
        return maxdif;
    }
}
