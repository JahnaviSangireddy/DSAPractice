package com.dsapractice.maths;

public class AmstrongNumber {
    public static void main(String[] args) {
        /*
            A number is said to be amstrong if it equals to sum of(each digit to power of num of digits)
            153=> 1^3 + 5^3 + 3^3
            1634=> 1^4 + 6^4 + 3^4 + 4^4
         */
        int ininum = 1634; int sum = 0;
        int numOfdigits = countDigits(ininum);

        int num = ininum;
        while(num > 0){
            sum = (int) (sum + (Math.pow(num%10 , numOfdigits)));
            num = num/10;
        }
        if(sum == ininum){
            System.out.println(ininum+" is amstrong");
        }
    }

    private static int countDigits(int num) {
        int count=0;
        while(num > 0){
            int dig = num%10;
            num = num/10;
            count++;
        }
        return count;
    }
}
