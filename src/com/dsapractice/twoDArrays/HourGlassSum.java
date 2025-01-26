package com.dsapractice.twoDArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourGlassSum {
    public static void main(String[] args) {
        int arr[][] = {{1 ,1 ,1 ,0 ,0 ,0},
                        {0 ,1 ,0 ,0 ,0 ,0},
                        {1 ,1 ,1 ,0 ,0 ,0},
                        {0 ,0 ,2 ,4 ,4 ,0},
                        {0 ,0 ,0 ,2 ,0 ,0},
                        {0 ,0 ,1 ,2 ,4 ,0}};
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            List<Integer> twodlist = new ArrayList<>();
            for(int j=0; j<arr.length; j++) {
                twodlist.add(arr[i][j]);
            }
            list.add(twodlist);
        }


        int maxsum = hourglassSum(list);
        System.out.println(maxsum);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxsum=Integer.MIN_VALUE;
        for(int rowst=0; rowst<=arr.size()-3;rowst++){
            for(int colst=0; colst<=arr.size()-3; colst++){
                int sum=0;
                for(int i=rowst; i<rowst+3; i++){
                    for(int j=colst; j<colst+3; j++){
                        if(i==rowst+1 && j!=colst+1){
                            System.out.print("x ");
                            continue;

                        }else{
                            System.out.print(arr.get(i).get(j)+" ");
                            sum = sum+ arr.get(i).get(j);
                        }
                    }
                    System.out.println();
                }
                System.out.println("*********************");
                maxsum = java.lang.Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }

}
