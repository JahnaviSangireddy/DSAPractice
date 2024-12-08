package com.dsapractice.twoPointersPatterns;

public class TwoSumProblem {
    public static void main(String[] args) {
        /*
        Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
         */
        int arr[]={2,7,11,15}; int target=9;
        int indexesarr[] = findTwoSum(arr,target);
        System.out.println(indexesarr[0]+" , "+indexesarr[1]);
    }

    private static int[] findTwoSum(int[] arr, int target) {
        int i=0; int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == target){
                return new int[]{i+1, j+1};
            } else if (arr[i]+arr[j] > target) {
                j--;
            }else if(arr[i]+arr[j] < target){
                i++;

            }
        }
        return new int[]{0,0};
    }
}
