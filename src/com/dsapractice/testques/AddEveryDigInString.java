package com.dsapractice.testques;

public class AddEveryDigInString {
    public static void main(String[] args) {
        /*
        Given two integers in string format, add the every digit in the ith place
        in both the strings and return the output as a String.
        The order of addition should from right side to left.
         */
        String s1="111";
        String s2= "99";
        String res = addStrs(s1,s2);
        System.out.println(res);
    }

    private static String addStrs(String s1, String s2) {
        int s1st=0, s1end= s1.length()-1;
        int s2st=0, s2end = s2.length()-1;
        StringBuilder res = new StringBuilder();
        while(s1end>=0 && s2end>=0){
            int sum = Integer.parseInt(s1.charAt(s1end)+"") + Integer.parseInt(s2.charAt(s2end)+"");
            res.insert(0,sum+"");
            s1end--; s2end--;
        }

            while(s1end>=0){
                res.insert(0,s1.charAt(s1end)+"");
                s1end--;
            }


            while(s2end>=0){
                res.insert(0,s2.charAt(s2end)+"");
                s2end--;
            }

        return res.toString();
    }
}
