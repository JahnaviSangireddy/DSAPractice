package com.dsapractice.twoDArrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIncompleteValidSudoko {
    public static void main(String[] args) {
        char board [][]={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean b = isboardValid(board);
        System.out.println(b);
    }

    private static boolean isboardValid(char[][] board) {
        for(int i=0; i<9; i++){
            if(!rowsValid(i,board) || !colsValid(i,board)){
                return false;
            }
        }
        for(int rowst=0; rowst<=6; rowst=rowst+3){
            for(int colst=0; colst<=6; colst = colst+3){
                if(!gridValid(rowst,colst,board)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean gridValid(int rowst, int colst, char[][] board) {
        Set<Character> gridset = new HashSet<>();
        for(int i=rowst; i<rowst+3; i++){
            for(int j=colst; j<colst+3; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(gridset.contains(board[i][j])){
                    return false;
                }
                gridset.add(board[i][j]);
            }
        }
        return true;
    }

    private static boolean colsValid(int j, char[][] board) {
        Set<Character> colset = new HashSet<>();
        for(int i=0; i<9; i++){
            if(board[i][j] == '.'){
                continue;
            }
            if(colset.contains(board[i][j])){
                return false;
            }
            colset.add(board[i][j]);
        }
        return true;
    }

    private static boolean rowsValid(int i, char[][] board) {
        Set<Character> rowset = new HashSet<>();
        for(int j=0; j<9; j++){
            if(board[i][j]=='.'){
                continue;
            }
            if(rowset.contains(board[i][j])){
                return false;
            }
            rowset.add(board[i][j]);
        }
        return true;
    }
}
