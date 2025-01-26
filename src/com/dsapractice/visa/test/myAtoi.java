package com.dsapractice.visa.test;

public class myAtoi {
    public static void main(String[] args) {
        String s = "   -042";
        int res = stoi(s);
        System.out.println(res);
    }

    private static int stoi(String s) {

        int sign=0; int res=0;
        if(s=="" || s.isEmpty()){
            return 0;
        }
        s=s.trim();
        if(s.charAt(0)=='+'){
            sign=1;
        }else if(s.charAt(0)=='-'){
            sign=-1;
        }
        int dig=0;

        for(int i=sign==0 ? 0 : 1; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                dig = s.charAt(i)-'0';
                System.out.println(dig);
                res = (res*10)+dig;
                System.out.println("res:"+res);
            }
        }

        if(res>Integer.MAX_VALUE){
            res = Integer.MAX_VALUE;
        }else if(res<Integer.MIN_VALUE){
            res = Integer.MIN_VALUE;
        }
        return sign==0 ? res :res*sign;
    }
}
