package com.dsapractice.codesignalIntro;

public class IsDigit {
    public static void main(String[] args) {
        char symbol = '9';
        boolean b = isDigitHere(symbol);
        System.out.println(b);
    }
    private static boolean isDigitHere(char c){

        return Character.isDigit(c);
    }
}
