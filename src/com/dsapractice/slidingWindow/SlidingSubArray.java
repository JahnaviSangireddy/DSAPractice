package com.dsapractice.slidingWindow;

public class SlidingSubArray {
    public static void main(String[] args) {
        /*
        Input: nums = [1,-1,-3,-2,3], k = 3, x = 2
        Output: [-1,-2,-2]
        Explanation: There are 3 subarrays with size k = 3.
        The first subarray is [1, -1, -3] and the 2nd smallest negative integer is -1.
        The second subarray is [-1, -3, -2] and the 2nd smallest negative integer is -2.
        The third subarray is [-3, -2, 3] and the 2nd smallest negative integer is -2.
         */
        int nums[] ={1, -1, -3, -2, 3};
        int k=3, x=2;
        int resarr[] = findSlidingSubArray(nums,k,x);
        for(int i : resarr){
            System.out.println(i);
        }

    }

    private static int[] findSlidingSubArray(int[] nums, int k, int x) {
        int winstart=0, winlast=k-1, sm=0, secsm=0; int resarr[] = new int[nums.length-2];
        int i=0, j=0, subarrayscount=0;
        while(winlast<nums.length){
            int winarr[] = new int[k];
            /////messed up
               // Arrays.sort(windowarr);

            resarr[subarrayscount] = secsm;
            subarrayscount++;
            winstart++; winlast++;
        }
    return resarr;
    }
}
