package com.dsapractice.codesignalIntro;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class EquallyStrong {
    public static void main(String[] args) {
        /*
        Problem
    --------------------------------------------------------------------------------
    Call two arms equally strong if the heaviest weights they each are able to
    lift are equal.

    Call two people equally strong if their strongest arms are equally strong
    (the strongest arm can be both the right and the left), and so are their
    weakest arms.

    Given your and your friend's arms' lifting capabilities find out if you two
    are equally strong.

    Example

    For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10,
    the output should be
    solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;

    For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10,
    the output should be
    solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;

    For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9,
    the output should be
    solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
         */

        int yourLeft=15;
        int yourRight=10;
        int friendsLeft=15;
        int friendsRight=9;

        boolean b = checkEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight);
        System.out.println(b);

    }

    private static boolean checkEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if(max(yourLeft,yourRight) == max(friendsLeft,friendsRight) &&
         min(yourLeft,yourRight) == min(friendsLeft,friendsRight)){
            return true;
        }
        return false;
    }
}
