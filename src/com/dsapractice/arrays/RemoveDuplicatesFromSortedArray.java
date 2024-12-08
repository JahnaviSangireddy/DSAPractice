package com.dsapractice.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5};
      //  int uniqElemnsSize = removeDuplicates(arr);
        int uniqarr[] = getUniqueElmnsArr(arr);
        for(int i: uniqarr){
            System.out.print(i+" ");
        }
        System.out.println("*************************");
      //  System.out.println(uniqElemnsSize);
    }

    private static int[] getUniqueElmnsArr(int[] arr) {
        int i=0;
        for(int j=1; j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        for(int k=i+1; k<arr.length;k++){
            arr[k] = 0;
        }
        return arr;
    }

    private static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
