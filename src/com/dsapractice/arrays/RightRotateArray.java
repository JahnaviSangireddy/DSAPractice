package com.dsapractice.arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
    /*to right rotate array by k(k=3) steps we get
        [5, 6, 7, 1, 2, 3, 4]
        step1. reverse the entire array
        step2. reverse first k elements (from index 0 to k-1)
        step 3 reverse remaining elements (from index k to n)

     */
        int k=3;
        int roatedArr[] = rotateArray(arr,k);
        for(int i: roatedArr){
            System.out.print(i+" , ");
        }
    }

    private static int[] rotateArray(int[] arr, int k) {
        int n=arr.length-1;
        arr = reverseElements(0, n, arr);
        arr = reverseElements(0, k-1, arr);
        arr = reverseElements(k,n,arr);
        return arr;
    }

    private static int[] reverseElements(int start, int n, int [] arr) {
        int i=start; int j=n;
        while(i<j){
            int t= arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++; j--;
        }
        return arr;
    }


}
