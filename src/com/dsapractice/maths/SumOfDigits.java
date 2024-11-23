package com.dsapractice.maths;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 29;
        int s = solution(n);
        System.out.println(s);
    }
    public static int solution(int n) {
        ArrayList<Integer> temps = new ArrayList<Integer>(Arrays.asList(15,22,25,16,19));
        int sum=0;
        while(n>0){
            int digit= n%10;
            sum = sum + digit;
            n= n/10;
        }
        return sum;
    }
}
