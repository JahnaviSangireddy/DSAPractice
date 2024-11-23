package com.dsapractice.maths;

public class LargestNDigitNumber {
    public static void main(String[] args) {
        int num = findLargetNDigitNum(7);
        System.out.println(num);
    }

    public static int findLargetNDigitNum(int n) {
        int num = 9;
        for(int i=1;i<n;i++){
            System.out.println(i);
            System.out.println("num before ops:"+num);
            num = (num * 10) + 9;
            System.out.println(num);
        }
        return num;
    }
}
