package com.dsapractice.arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
      //  int roatedarr[] = leftRotateArr(arr);
     //   for(int i: roatedarr){
    //        System.out.print(i+" , ");
     //   }
    //    System.out.println("*************");
        int k=3;
        int rotatedkTimes[] = leftRotateArrKTimes(arr,k);
        for(int i: rotatedkTimes){
            System.out.print(i+" , ");
        }
    }

    private static int[] leftRotateArrKTimes(int[] arr, int k) {
        int temparr [] = new int [k];
        int n = arr.length;
        for(int i=0;i<k;i++){
            temparr[i] = arr[i];
        }

        for(int i=k; i<arr.length;i++){
            arr[i-k] = arr[i];
        }

        for(int i=n-1-k;i>0;i--){
            arr[n-i] = temparr[k-i];
        }
        return arr;
    }

    private static int[] leftRotateArr(int[] arr) {
        int k=1;
        int t = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = t;
        return arr;
    }
}
