package com.dsapractice.arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] ={1, 2, 0, 3, 0, 0, 4};
        arr = moveZeros(arr);
        for(int i: arr){
            System.out.print(i+" , ");
        }
    }

    private static int[] moveZeros(int[] arr) {
        int n= arr.length;
        int i=0; int j=0;
        while(j<n){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++; j++;
            }else{
                j++;
            }
        }
        for(int k=i; k< arr.length;k++){
            arr[k] = 0;
        }
        return arr;
    }
}
