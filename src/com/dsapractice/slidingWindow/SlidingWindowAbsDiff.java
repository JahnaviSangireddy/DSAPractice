package com.dsapractice.slidingWindow;

public class SlidingWindowAbsDiff {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 2, 8, 4};
        int threshold=4;
        int maxlen = findMaxlen(arr,threshold);
        System.out.println(maxlen);
    }

    private static int findMaxlen(int[] arr, int threshold) {
        int st=0, end=0, maxlen = 0;
        while(end<arr.length){
            int min = arr[st];
            int max = arr[st];
            for(int i = st; i<end; i++){
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }
            if((max-min) > threshold){
                st++;
            }else{
               int len = end-st+1;
                maxlen = Math.max(len,maxlen);
                end++;
            }
        }
        return maxlen;
    }
}
