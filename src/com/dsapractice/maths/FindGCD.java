package com.dsapractice.maths;

public class FindGCD {
    public static void main(String[] args) {
        int n1= 100; int n2=200;
        int gcd = findGcd(n1,n2);
        int gcd1 = findGCDUsingMinMethod(n1,n2);
        System.out.println("GCD of "+n1+" , "+n2+" is "+gcd);
        System.out.println("GCD of "+n1+" , "+n2+" is "+gcd1);
    }

    private static int findGcd(int n1, int n2) {
        int gcd=1;
        for(int i=1; (i<=n1) && (i<=n2) ; i++){
            if((n1%i == 0) && (n2%i ==0)){
                gcd=i;
            }
        }
        return gcd;
    }
    //initialize gcd as min of n1,n2. loop using initial val as gcd and minimize till 1
// divide both nums. if there is a number that divides both n1 ,n2 break the loop and return that number

    private static int findGCDUsingMinMethod(int n1, int n2) {
        int gcd = n1>n2 ?n2 : n1;
        for(int i=gcd;i>=1;i--){
            if((n1%i ==0) && (n2%i == 0)){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}




