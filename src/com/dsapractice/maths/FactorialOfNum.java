package com.dsapractice.maths;

public class FactorialOfNum {

    public static void main(String[] args){
        int num = 6;
        int fac = findFactorial(num);
        System.out.println("Factorial of "+num+" is "+fac);
    }

    private static int findFactorial(int num) {
        int res=1;
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            while(num!=1){
             res = res*num;
             num = num-1;
            }
            return res;
        }
    }
}
