package com.dsapractice.testques;

public class ShiftLeftOrRight {
    public static void main(String[] args) {
        String input = "LLRRLRL";
        int stpos=0;
        int fipos = findFinalPosition(input,stpos);
        System.out.println(fipos);
    }

    private static int findFinalPosition(String input, int stpos) {
        char ch[] = input.toCharArray();
        int res=stpos;
        for(char c : ch){
            if(c=='L'){
                res = res -1;
            }else if(c=='R'){
                res = res+1;
            }
        }
        return res;
    }
}
