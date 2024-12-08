package com.dsapractice.arrays;



import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

        public class MaxSubArraySumUsingKandanesAlgo {
            public static void main(String[] args) {
                // iterate trough the array and add currsum. comapre currsum, maxsum.
                //If currsum <0 reset it to 0
                int nums[]={-2,1,-3,4,-1,2,1,-5,4};
                int maxSum = maxSubArraySumusingAlgo(nums);
                System.out.println(maxSum);
            }

            private static int maxSubArraySumusingAlgo(int[] nums) {
                int currsum=0; int maxSum= Integer.MIN_VALUE;
                List<Integer> subarray = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            currsum = currsum + nums[i];
            maxSum = max(maxSum, currsum);
            subarray.add(nums[i]);

            if(currsum < 0){
                currsum = 0;
                subarray.removeAll(subarray);
            }
        }
        for(int subarritem : subarray){
            System.out.println(subarritem);
        }
        return maxSum;
    }
}
