package com.dsapractice.binarySearch;

public class SearchInRoatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {3,4,5,6,7,0,1,2};
        int target=0;
        int searchIndex = searchArray(nums, target);
        System.out.println(searchIndex);
    }

    private static int searchArray(int[] nums, int target) {
        int st=0; int end = nums.length-1;
        int searchIndex=0;
        int mid = 0;
        while(st<=end){
            mid = st + (end-st)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[st] <= nums[mid]){
                //left sorted
                if(nums[st] <= target  && target <= nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                //right sorted
                if(nums[mid] <=target && target<=nums[end]){
                    st=mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
