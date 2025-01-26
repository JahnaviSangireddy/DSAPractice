package com.dsapractice.visa.test;

import java.util.HashSet;
import java.util.Set;

public class CrystalIllumination {
    public static void main(String[] args) {
        int[][] crystals = {
                {1, 1},
                {1, 2},
                {2, 1},
                {2, 2}
        };

        // Count intersections
        int result = countIntersections(crystals);
        System.out.println("Number of intersections: " + result);
    }

    private static int countIntersections(int[][] crystals) {
        Set<String> illuminated = new HashSet<>();
        Set<String> intersection = new HashSet<>();

        int [][] directions = {{0,0}, {1,0}, {-1,0}, {0,1}, {0,-1}};

        for(int [] crystal : crystals){
            int x = crystal[0];
            int y = crystal[1];

            for(int [] dir : directions){
                int nx = x+dir[0];
                int ny = y + dir[1];

                String box = nx+","+ny;
                if(!illuminated.add(box)){
                    intersection.add(box);
                }
            }
        }
        return intersection.size();
    }
}
