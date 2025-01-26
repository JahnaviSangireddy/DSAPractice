package com.dsapractice.arrays;

public class MajorityElement {
    public static void main(String[] args) {
        /*
        Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.
        Could you solve the problem in linear time and in O(1) space?
         */
        int nums[] ={2,2,1,1,1,2,2,1,1};
        int majelm = findMajorityElement(nums);
        System.out.println(majelm);
    }

    private static int findMajorityElement(int[] nums) {
        int majelm= nums[0]; int count =0;
        for(int num : nums){
            if(count == 0){
                majelm = num;
            }
            if(majelm == num){
                count++;
            }else{
                count--;
            }
            System.out.println(count);
        }
        return majelm;
    }
}
