package com.dsapractice.codesignalIntro;

public class RemoveEachKthElm {
    public static void main(String[] args) {
        /*
          Problem
    --------------------------------------------------------------------------------
    Given array of integers, remove each kth element from it.

    Example

    For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
    solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
         */
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=3;
        int outarr[] = removeEachKthElm(arr,k);
        for(int i : outarr){
            System.out.print(i+" ");
        }
    }

    private static int[] removeEachKthElm(int[] arr, int k) {
        int size = arr.length - (arr.length/k);
        int outarr[] = new int[size];
        int j=0;
        for(int i=0; i<arr.length; i++){

           if((i+1) % k ==0){
               continue;
           }
            outarr[j] = arr[i];
           j++;
        }
        return outarr;
    }
}
