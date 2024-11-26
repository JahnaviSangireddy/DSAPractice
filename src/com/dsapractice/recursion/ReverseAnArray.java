package com.dsapractice.recursion;

public class ReverseAnArray {

    public static void main(String[] args) {
        int arr[] = {10,1, 2, 3, 4, 5};
        int i = 0, j=arr.length-1;
        reverserecursive(arr,i,j);
        for(int k: arr){
            System.out.println(k);
        }

    }

    public static void reverserecursive(int arr[],int i,int j){
        if(i>=j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverserecursive(arr,i+1,j-1);
    }
}
