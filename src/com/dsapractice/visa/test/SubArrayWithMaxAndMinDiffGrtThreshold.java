package com.dsapractice.visa.test;

import java.util.Map;
import java.util.TreeMap;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class SubArrayWithMaxAndMinDiffGrtThreshold {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 8, 3, 7}, threshold = 3;
        int maxlen = findMaxLengthOfSubarray(arr,threshold);
        System.out.println(maxlen);
    }

    private static int findMaxLengthOfSubarray(int[] arr, int threshold) {
        int st=0, end=0, len=0, maxlen=0, minnum=arr[0], maxnum=arr[0];
        TreeMap<Integer,Integer> freqMap = new TreeMap<>();
        while(end<arr.length){
            freqMap.put(arr[end],freqMap.getOrDefault(arr[end],0)+1);
            while(freqMap.lastKey() - freqMap.firstKey() > threshold){
                freqMap.put(arr[st], freqMap.get(arr[st])-1);
                if(freqMap.get(arr[st])==0){
                    freqMap.remove(arr[st]);
                }
                st++;
            }
            len = end - st +1;
            maxlen = max(len,maxlen);
            end++;
        }
        return maxlen;
    }
}
