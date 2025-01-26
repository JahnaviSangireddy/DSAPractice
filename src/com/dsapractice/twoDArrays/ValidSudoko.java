package com.dsapractice.twoDArrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
    public static void main(String[] args) {
        int sudoko[][] = {
                {1, 3, 2, 5, 4, 6, 9, 8, 7},
                {4, 6, 5, 8, 7, 9, 3, 2, 1},
                {7, 9, 8, 2, 1, 3, 6, 5, 4},
                {9, 2, 1, 4, 3, 5, 8, 7, 6},
                {3, 5, 4, 7, 6, 8, 2, 1, 9},
                {6, 8, 7, 1, 9, 2, 5, 4, 3},
                {5, 7, 6, 9, 8, 1, 4, 3, 2},
                {2, 4, 3, 6, 5, 7, 1, 9, 8},
                {8, 1, 9, 3, 2, 4, 7, 6, 5}
        };
        boolean b = checkIfSudokoIsValid(sudoko);
        System.out.println(b);
    }

    private static boolean checkIfSudokoIsValid(int[][] sudoko) {
        for(int i=0; i<9; i++){
            if(!checkvalidRow(i,sudoko) || !checkvalidCol(i,sudoko)){
                return false;
            }
        }
        for(int rowst=0; rowst<9; rowst=rowst+3){
            for(int colst=0; colst<9; colst = colst+3){
                if(!checkgrid(rowst,colst,sudoko)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkgrid(int rowst, int colst, int[][] sudoko) {
        Set<Integer> gridset= new HashSet<>();
        for(int i=rowst; i<rowst+3; i++){
            for(int j=colst; j<colst+3; j++){
                if(gridset.contains(sudoko[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkvalidCol(int col, int[][] sudoko) {
        Set<Integer> colset = new HashSet<>();
        for(int i=0; i<9; i++){
            if(colset.contains(sudoko[i][col])){
                return false;
            }
            colset.add(sudoko[i][col]);
        }
        return true;
    }

    private static boolean checkvalidRow(int row, int[][] sudoko) {
        Set<Integer> rowset = new HashSet<>();
        for(int i=0; i<9;i++){
            if(rowset.contains(sudoko[row][i])){
                return false;
            }
            rowset.add(sudoko[row][i]);
        }
        return true;
    }
}
