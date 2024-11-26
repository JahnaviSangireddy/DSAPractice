package com.dsapractice.recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n=5;
        int sum =sumOfNumbers(n);
        System.out.println(sum);
    }

    private static int sumOfNumbers(int n) {
        if(n>=1){
            return n+sumOfNumbers(n-1);
        }
        return 0;
    }
}
