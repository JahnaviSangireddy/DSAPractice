package com.dsapractice.arrays;

public class IndexesOfSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int target = 12;

        int indexesarr[] = findIndexesOfSubArraySum(arr,target);
        for(int i: indexesarr){
            System.out.println(i);
        }

    }

    private static int[] findIndexesOfSubArraySum(int[] arr, int target) {
        int currsum=0; int start =0; int end=0;
        // 1,2,3,7,5

        for(end=0; end<arr.length;end++){
            currsum = currsum+arr[end];

            while(currsum > target && start <= end){
                currsum = currsum-arr[start];
                start++;
            }

            if(currsum == target){
                return new int[]{start+1, end+1};
            }
        }

        return new int[]{-1,-1};
    }
}
