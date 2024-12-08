package com.dsapractice.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] ={10, 20, 30, 40, 50};
        int target = 20;
        int index = binarySearchTarget(nums,target);
        System.out.println(index);
    }

    private static int binarySearchTarget(int[] nums, int target) {
        int st=0; int end = nums.length-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target < nums[mid]){
                //left side
                end = mid-1;
            }
            if(target > nums[mid]){
                st = mid+1;
            }
        }
        return -1;
    }
}
