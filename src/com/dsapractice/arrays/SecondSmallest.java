package com.dsapractice.arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] ={12, 35, 1, 10, 34, 8, 1};
        int arr1[] ={10, 5, 10};
        int secMin = findSecondSmallest(arr);
        System.out.println(secMin);
    }

    private static int findSecondSmallest(int[] arr) {
        int min=arr[0];
        int secMin = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                secMin = min;
                min = arr[i];
            }else if(arr[i] > min && arr[i] < secMin){
                secMin =arr[i];
            }
        }
        return secMin;
    }

}
