package com.dsapractice.testques;

public class AddEveryDigitFromRightToLeft {
    public static void main(String[] args) {
        String s1="11";
        String s2 = "9";
        String res = addTwoStrings(s1,s2);
        System.out.println(res);
    }

    private static String addTwoStrings(String s1, String s2) {
        int i=s1.length()-1,j=s2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>=0){
            int num1= Integer.parseInt(s1.charAt(i)+"");
            int num2 = Integer.parseInt(s2.charAt(j)+"");
            int sum = num1+num2;
            sb.insert(0,sum+"");
            i--;j--;
        }
        while(i>=0){
            sb.insert(0,s1.charAt(i)+"");
            i--;
        }
        while(j>=0){
            sb.insert(0,s2.charAt(j)+"");
            j--;
        }
        return sb.toString();
    }
}
