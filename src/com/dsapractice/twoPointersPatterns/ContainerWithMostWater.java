package com.dsapractice.twoPointersPatterns;

import static java.lang.Math.min;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int heightsarr[] = {1,8,6,2,5,4,8,3,7};
        int maxArea = calculateMaxArea(heightsarr);
        System.out.println(maxArea);
    }

    private static int calculateMaxArea(int[] heightsarr) {
        int i=0; int j= heightsarr.length-1;
        int maxArea = 0;
        while(i<j){
            int height = min(heightsarr[i],heightsarr[j]);
            int width = j-i;
            int area = height * width;
            if(area > maxArea){
                maxArea = area;
            }
            if(height == heightsarr[i]){
                i++;
            }else{
                j--;
            }
        }
       return maxArea;
    }
}
