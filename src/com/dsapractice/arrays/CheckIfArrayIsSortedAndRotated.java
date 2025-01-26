package com.dsapractice.arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        /*
        Array is sorted => arr[i] > arr[j] => count=0
         Array is sorted and rotated => arr[i] > arr[j] => count=1
         Array is neither sorted nor rotated => arr[i] > arr[j] => count >1
         */
        int arr[] = {3, 4, 5, 1, 2};
        boolean b = checkArrIsSortedAndRoated(arr);
        System.out.println(b);
    }

    private static boolean checkArrIsSortedAndRoated(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}
