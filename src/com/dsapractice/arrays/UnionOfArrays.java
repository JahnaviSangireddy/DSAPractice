package com.dsapractice.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 6};
        int b[] = {2, 3, 5, 7};
        List<Integer> union = findUnion(a,b);
        for(int num : union){
            System.out.print(num+" ");
        }
    }

    private static List<Integer> findUnion(int[] a, int[] b) {
        int i=0, j=0;
        List<Integer> union = new ArrayList<>();
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]){
                if(!union.contains(a[i])){
                    union.add(a[i]);
                }
                i++;
            }else if(b[j] < a[i]){
                if(!union.contains(b[j])){
                    union.add(b[j]);
                }
                j++;
            }else if(a[i] == b[j]){
                if(!union.contains(a[i])){

                    union.add(a[i]);
                }
                i++; j++;
            }

        }
        while(i < a.length){
            if(!union.contains(a[i])){
                union.add(a[i++]);
            }
        }
        while(j < b.length){
            if(!union.contains(b[j])){
                union.add(b[j++]);
            }
        }
        return union;
    }
}
