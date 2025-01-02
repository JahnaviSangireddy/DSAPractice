package com.dsapractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int unqelmns = findUniqarr(arr);
        System.out.println("unqelmns"+unqelmns);
      //  int uniqElemnsSize = removeDuplicates(arr);
     //   int uniqarr[] = getUniqueElmnsArr(arr);
     //   for(int i: uniqarr){
      //      System.out.print(i+" ");
     //   }
     //   System.out.println("*************************");
      //  System.out.println(uniqElemnsSize);
    }

    private static int findUniqarr(int[] nums) {
        Set<Integer> unqset = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            unqset.add(nums[i]);
        }
        int expectednums[] = new int[nums.length];
        int j=0;
        for(int k : unqset){
            System.out.println(k);
            expectednums[j++] = k;
        }

        for(int i=unqset.size(); i<nums.length;i++){
            expectednums[i] ='_';
        }
        for(int l : expectednums){
            System.out.print(l+" ");
        }
        return unqset.size();
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
