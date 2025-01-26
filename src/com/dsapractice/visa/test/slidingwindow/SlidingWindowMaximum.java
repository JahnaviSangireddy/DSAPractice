package com.dsapractice.visa.test.slidingwindow;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        /*
        Given an array nums and a window size k, return the maximum element in each sliding window of size k.
Example:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
         */
        int nums[] = {1,3,-1,-3,5,3,6,7}, k=3;
        int res[] = findMaxElmInEachWindow(nums,k);
        for(int i : res){
            System.out.print(i+", ");
        }
    }

    private static int[] findMaxElmInEachWindow(int[] nums, int k) {
        int st=0,end=0,maxelm=Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<k;i++){
            maxelm = max(maxelm,nums[i]);
        }
        list.add(maxelm);
        end=k;
        while(end<nums.length){

            end++;
        }
        return null;
    }
}
