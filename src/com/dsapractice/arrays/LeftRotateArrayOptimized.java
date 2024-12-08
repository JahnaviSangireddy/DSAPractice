package com.dsapractice.arrays;

public class LeftRotateArrayOptimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        /*
        step 1. reverse the first k elm [3, 2, 1, 4, 5, 6, 7]
        step 2. reverse remaining elms  [3, 2, 1, 7, 6, 5, 4]
        step 3. reverse entire array. [4, 5, 6, 7, 1, 2, 3]
         */
        int k=3;
        int rotatedkTimes[] = leftRotateArrKTimesOpt(arr,k);
        for(int i: rotatedkTimes){
            System.out.print(i+" , ");
        }
    }

    private static int[] leftRotateArrKTimesOpt(int[] arr, int k) {
        int n= arr.length;
       arr = reversearr(0,k-1, arr);
       arr = reversearr(k,n-1, arr);
       arr = reversearr(0,n-1, arr);
        return arr;
    }

    private static int[] reversearr(int i, int i1, int[] arr) {

        while(i<i1){
            int t= arr[i];
            arr[i] = arr[i1];
            arr[i1] = t;
            i++; i1--;
        }
        return arr;
    }
}
