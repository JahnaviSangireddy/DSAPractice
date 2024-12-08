package com.dsapractice.arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1, 0 ,0, 1, 1, 1, 1, 1};
        int maxCount = maxConsecutiveOnes(arr);
        System.out.println(maxCount);
    }

    private static int maxConsecutiveOnes(int[] arr) {
         int count=0; int maxCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                    count=0;
                }
            }
        }
        if(count > maxCount){
            maxCount = count;
            count=0;
        }
        return maxCount;
    }
}
