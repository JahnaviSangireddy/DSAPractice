package com.dsapractice.arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        //int prodarr[] = findproduct(arr);
        int prodarr[] = findproduct1(arr);
        for(int i : prodarr){
            System.out.print(i+" ");
        }
    }

    private static int[] findproduct1(int[] arr) {
        int product [] = new int [arr.length];
        int p=1; int i=0;
        for(int j=0; j<arr.length; j++){
            p = p*arr[j];
        }
        for( i=0; i<arr.length; i++){
            product[i] = p/arr[i];
        }
        return product;
    }

    private static int[] findproduct(int[] arr) {
        int n= arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int result[] = new int[n];

        prefix[0]=1;
        for(int i=1; i<n;i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        suffix[n-1] = 1;
        for(int i = n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        for(int i=0; i<n;i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}
