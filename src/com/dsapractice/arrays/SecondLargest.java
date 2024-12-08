package com.dsapractice.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] ={12, 35, 1, 10, 34, 1};
        int arr1[] ={10, 5, 10};
        int seclargest = findSecondLargest(arr);
        System.out.println(seclargest);
    }

    private static int findSecondLargest(int[] arr) {
        int n=arr.length;
        int max=0; int secMax=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                secMax=max;
                max=arr[i];
            }else if(arr[i] < max && arr[i] > secMax){
                secMax = arr[i];
            }
        }
        if(secMax == 0){
            secMax = -1;
        }

        return secMax;
    }
}
