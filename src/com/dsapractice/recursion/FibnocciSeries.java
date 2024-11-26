package com.dsapractice.recursion;

public class FibnocciSeries {

    public static void main(String[] args) {
        int n=15; int n1=0; int n2=1;
        System.out.print(n1+" , "+n2+" , ");
        fibnocci(n,n1,n2);
    }

    private static void fibnocci(int n,int n1, int n2) {
        int n3= n1+n2;
        if(n3>=n){
            return;
        }
        System.out.print(n3+" , ");
        fibnocci(n,n2,(n3));
    }

}
