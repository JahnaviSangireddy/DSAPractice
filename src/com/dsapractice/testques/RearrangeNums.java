package com.dsapractice.testques;

import java.util.ArrayList;
import java.util.List;

public class RearrangeNums {
    /*
    1. Given an array numbers create a new array which should be in the following manner
  a. 1st element of the new array should be the first element in array number
b. 2nd element = last element in array number
C. 3rd element = 1st element in array number
d. 4th element = last -second element in number

     */
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        List<Integer> res = rearrange(arr);
        for(int i: res){
            System.out.print(i+" ");
        }
    }

    private static List<Integer> rearrange(int[] arr) {
        int st=0; int end=arr.length-1;
        List<Integer> res = new ArrayList<>();
        while(st<=end){
            if(st==end){
                res.add(arr[st++]);
            }else{
                res.add(arr[st++]);
                res.add(arr[end--]);
            }
        }
        return res;
    }
}
