package com.dsapractice.visa.test;

import java.util.HashSet;
import java.util.Set;

public class FindPairsThatMeetCond {
    public static void main(String[] args) {
        int nums[] = {1,153,1,9,54,353,22};
        int countofValidPairs = findValidPairsHere(nums);
        System.out.println(countofValidPairs);
    }

    private static int findValidPairsHere(int[] nums) {
        Set<String> pairs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(numsAreValid(nums[i],nums[j])){
                    String s = (nums[i]<nums[j])? nums[i]+","+nums[j] : nums[j]+","+nums[i];
                    pairs.add(s);
                }
            }
        }
        for(String s : pairs){
            System.out.println(s);
        }
        return pairs.size();
    }

    private static boolean numsAreValid(int num1, int num2) {
        String n1 = String.valueOf(num1);
        String n2 = String.valueOf(num2);
        if(n1.length() != n2.length()){
            return false;
        }
        int i=0; int mismatch=0;
        while(i<n1.length()){
            if(n1.charAt(i) != n2.charAt(i)){
                mismatch++;
            }
            i++;
        }
        if(mismatch > 1){
            return false;
        }
        return true;
    }
}
