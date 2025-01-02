package com.dsapractice.arrayPairingAndMatching;

public class PairsWithMaxGCD {
    /*
    **Find Pair of Numbers with Maximum GCD**
    - Given an array, find a pair of numbers with the highest Greatest Common Divisor (GCD).
    - Example: `Input: [12, 15, 21, 30]` → `Output: (15, 30)`
     */
    public static void main(String[] args) {
        int[] input = {12,15,21,30};
        int [] res = pairwithMaxGCD(input);
        System.out.println(res[0]+","+res[1]);
    }

    private static int[] pairwithMaxGCD(int[] input) {
        int maxGcd=0; int [] res = new int[2];
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                int gcd = findGcd(input[i],input[j]);
                if(gcd>maxGcd){
                    maxGcd = gcd;
                    res[0]=input[i];
                    res[1]=input[j];
                }
            }
        }
        return res;
    }

    private static int findGcd(int a, int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }


}
