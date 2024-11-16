package com.dsapractice.maths;

//Given a number, calculate the factorial and count the tailing zeros.
// ex: n=5, 5!=120, nooftailing 0s =1.

public class CountTailingZerosInFactorial {

    public static void main(String[] args) {
        int n=20;
        int zs = countOfTailingZeros(n);
        System.out.println("number of tailing 0s in "+n+"! is "+zs);
    }

    private static int countOfTailingZeros(int n) {
        int count =0;
        long fact = factorial(n);
        System.out.println(n+"! is "+fact);
        long lastDig = fact%10;
        while(lastDig==0){
            count++;
            fact = fact/10;
            lastDig = fact%10;
        }
        return count;
    }

    private static long factorial(int n) {
        long fact =1;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            while(n!=0){
                fact = fact * n;
                n--;
            }
            return fact;
        }
    }
}
