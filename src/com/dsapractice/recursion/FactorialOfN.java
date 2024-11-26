package com.dsapractice.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        int n=5;
        int fact = findFactorial(n);
        System.out.println(fact);
    }

    private static int findFactorial(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
           return n * findFactorial(n-1);
        }
    }
}
