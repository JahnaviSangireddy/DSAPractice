package com.dsapractice.maths;

public class FindGCDUsingRecursion {
    public static void main(String[] args) {
        int n1=12, n2=15;

        int gcd = findGcdUsingRecursion(n1,n2);
        System.out.println("GCD of "+n1+" , "+n2+" is "+gcd);
    }

    private static int findGcdUsingRecursion(int n1, int n2) {
        if(n2==0){
            return n1;
        }else{
            return findGcdUsingRecursion(n2,n1%n2);
        }
    }
}
