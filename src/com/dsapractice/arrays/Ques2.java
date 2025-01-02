package com.dsapractice.arrays;

public class Ques2 {
    public static void main(String[] args) {
        /*
        Given a string of numbers, if there are consecutive same digit in a number, replace it with sum of its digit.
{1,23,4332,64} replace 4332 with 12.
         */
        String nums[] = {"1", "233", "4332", "644"};
        String res[] = processNums(nums);
        for(String s : res){
            System.out.println(s);
        }
    }

    private static String[] processNums(String[] nums) {
        for(int k=0; k<nums.length; k++){
            char ch[] = nums[k].toCharArray();
            for(int i=0; i<ch.length-1; i++){
                if(ch[i] == ch[i+1]){
                    int num = Integer.parseInt(nums[k]);
                    int sum = 0;
                    while(num!=0){
                        int dig = num%10;
                        num = num/10;
                        sum = sum+(dig);
                    }
                    nums[k] = new String(String.valueOf(sum));
                }

            }
        }
        return nums;
    }
}
