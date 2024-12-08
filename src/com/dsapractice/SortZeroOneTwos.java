package com.dsapractice;

public class SortZeroOneTwos {
    public static void main(String[] args) {
        int nums[] ={2, 0, 1,};
        sortZeroOneTwos(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    private static void sortZeroOneTwos(int[] nums) {
       int start=0; int end=nums.length-1; int mid=0;
       while(mid<=end){
          switch(nums[mid]){
              case 0:
                   swap(start, mid, nums);
                   start++; mid++;
                   break;
                   case 1:
                   mid++;
                   break;
              case 2:
                   swap(mid,end, nums);
                   end--;
           }

       }
    }

    private static void swap(int i, int j, int[] nums) {
        int t= nums[i];
        nums[i]=nums[j];
        nums[j] = t;
    }
}
