package com.dsapractice.visa.test;

public class ReplaceNumWithSumOfDigits {
    public static void main(String[] args) {
        String nums[] = {"1","233","4332","64"};
        String repnums[] = replaceNums(nums);
        for(String s : repnums){
            System.out.println(s);
        }
    }

    private static String[] replaceNums(String[] nums) {
        for(int n=0; n<nums.length; n++){
            String s = nums[n];
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    String replacesstr = replaceWithSum(s);
                    nums[n] = replacesstr;
                }
            }
        }
        return nums;
    }

    private static String replaceWithSum(String s) {
        int num = Integer.parseInt(s);
        int sum=0;
        while(num!=0){
            int dig = num%10;
            sum = sum + dig;
            num = num/10;
        }
        return sum+"";
    }
}
