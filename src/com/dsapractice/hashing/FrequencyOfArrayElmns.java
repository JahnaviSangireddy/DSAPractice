package com.dsapractice.hashing;

import java.util.Arrays;

public class FrequencyOfArrayElmns {
    public static void main(String[] args) {
        /*
            given arr[] = {2, 3, 2, 3, 5};
            return freqarr[] ={0, 2, 2, 0, 1};
            1 occurs 0 times,
            2 occurs 2 times,
            3 occurs 2 times,
            4 occurs 0 times,
            5 occurs 1 times,

         */

       int[] arr = {2, 3, 2, 3, 5, 3};
       int[] freqarr = generateFreqCountArr(arr);
       for(int i : freqarr){
           System.out.println(i);
       }
        System.out.println("*********************");
       //find highest and lowest freq elm
        int[] hiloarr = findHighestAndLowestFreqElm(freqarr);
       for(int i : hiloarr){
           System.out.println(i);
       }

    }

    private static int[] findHighestAndLowestFreqElm(int[] freqarr) {
        int high=0; int low = 0;
        int max = Arrays.stream(freqarr).max().getAsInt();
        int min = Arrays.stream(freqarr).min().getAsInt();
        for(int i=0; i<freqarr.length;i++){
            if(freqarr[i] == max){
                high = i;
            }
            if(freqarr[i] == min+1){
                low = i;
            }
        }

        return new int[]{high, low};
    }

    private static int[] generateFreqCountArr(int[] arr) {
        int max = findMax(arr);
        int[] freqcountarr = new int[max+1];
        for(int i : arr){
            freqcountarr[i]++;
        }
        return freqcountarr;
    }

    private static int findMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
