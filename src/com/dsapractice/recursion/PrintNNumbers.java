package com.dsapractice.recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        int num=1;
        printNumbers(num);

    }

    private static void printNumbers(int num) {

        System.out.println(num);
        num++;
        if(num<=5)
        printNumbers(num);

    }
}
