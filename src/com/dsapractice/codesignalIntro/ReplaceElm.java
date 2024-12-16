package com.dsapractice.codesignalIntro;

public class ReplaceElm {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given an array of integers, replace all the occurrences of elemToReplace
    with substitutionElem.

    Example

    For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3,
    the output should be
    solution(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
         */
        int arr[] = {1, 2, 1};
        int elmToReplace = 1;
        int substitutionElm = 3;
        int outarr [] =replaceallelm(arr,elmToReplace, substitutionElm);
        for(int i : outarr){
            System.out.println(i);
        }
    }

    private static int[] replaceallelm(int[] arr, int elmToReplace, int substitutionElm) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == elmToReplace){
                arr[i] = substitutionElm;
            }
        }
        return arr;
    }
}
