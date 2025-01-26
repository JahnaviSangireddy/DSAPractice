package com.dsapractice.codesignalIntro;

import java.util.ArrayList;
import java.util.List;

public class AddBorderToMatrix {
    public static void main(String[] args) {
        /*
        Given a rectangular matrix of characters, add a border of asterisks(*) to it.

    Example

    For
    picture = a b c
              d e d

    the output should be
    solution(picture) = * * * * *
                        * a b c *
                        * d e d *
                        * * * * *
         */
        String[] picture = {
                "a b c",
                "d e d"
        };

        List<String> result = solution(picture);

        // Print the framed picture
        for (String row : result) {
            System.out.println(row);
        }

    }

    private static List<String> solution(String[] picture) {
        List<String> boarderedpic = new ArrayList<>();
        String s = "* ".repeat(picture[0].length());
        boarderedpic.add(s);
        for(String row : picture){
            String srow = "* "+row+" *";
            boarderedpic.add(srow);
        }
        boarderedpic.add(s);
        return boarderedpic;
    }


}
