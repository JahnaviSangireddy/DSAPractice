package com.dsapractice.binarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        /*
        You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

        Return the single element that appears only once.
        Your solution must run in O(log n) time and O(1) space.
         */

        int nums[] ={1,1,2,2,3,3,4,8,8};
        int singleElm = findSingleElm(nums);
        System.out.println(singleElm);
    }

    private static int findSingleElm(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int st=0; int end = nums.length-1;
        int n=nums.length;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(mid == 0 && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(mid == n-1 && nums[n-1] != nums[n-2]){
                return nums[mid];
            }
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }

            if(mid%2 ==0){ //both sides even
                if(nums[mid] == nums[mid-1]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{ //both sides odd
                if(nums[mid] == nums[mid-1]){
                    st= mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
