package com.dsapractice.maths;

public class PalindromeNumber {

    public static void main(String[] args){
        int num = 1234;
        boolean isPalindrome = checkPalindrome(num);
        System.out.println(num+" is palindrome: "+isPalindrome);
    }

    private static boolean checkPalindrome(int num) {
        int n= num;
        int res=0;
        while(num>0){
            res = (res * 10) + num%10;
            num = num/10;
        }
        System.out.println("num :"+n+" res:"+res);
        if(n == res){
            return true;
        }
        return false;
    }
}
