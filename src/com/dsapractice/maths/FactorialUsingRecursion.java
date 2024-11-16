package com.dsapractice.maths;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int n=10;
        int fact = findFactorialReccursive(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }

    private static int findFactorialReccursive(int n) {

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return n*findFactorialReccursive(n-1);
        }
    }


}
