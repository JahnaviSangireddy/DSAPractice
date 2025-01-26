package com.dsapractice.testques;

import java.util.ArrayList;
import java.util.List;

public class ReplaceConsequtiveSameNums {
    public static void main(String[] args) {
        /*
        Given a string of numbers, if there are consecutive same digit in a number, replace it with sum of its digit.
{1,23,4332,64} replace 4332 with 12.
         */
        String nums[]={"1","23","4332","64"};
        String modifiedNums[] = modify(nums);
        for(String num : modifiedNums){
            System.out.print(num+" ");
        }
    }

    private static String[] modify(String[] nums) {
       // List<String> newnums = new ArrayList<>();
        for(int k=0; k<nums.length; k++){
            boolean addnums=false;
           // System.out.println(nums[k]);
            String s=nums[k];
            for(int i=0; i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    addnums=true;
                }
            }
            if(addnums){
                s = addDigits(s);
            }
            //System.out.println(s);
            nums[k]=s;
        }
        return nums;
    }

    private static String addDigits(String s) {
        int num = Integer.parseInt(s);
        int sum = 0;
        while(num>0){
            int dig = num%10;
            sum = sum + dig;
            num = num/10;
        }
        return sum+"";
    }
}
