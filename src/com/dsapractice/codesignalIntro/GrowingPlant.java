package com.dsapractice.codesignalIntro;

public class GrowingPlant {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Caring for a plant can be hard work, but since you tend to it regularly,
    you have a plant that grows consistently. Each day, its height increases by
    a fixed amount represented by the integer upSpeed. But due to lack of
    sunlight, the plant decreases in height every night, by an amount
    represented by downSpeed.

    Since you grew the plant from a seed, it started at height 0 initially.
    Given an integer desiredHeight, your task is to find how many days it'll
    take for the plant to reach this height.

    Example

    For upSpeed = 100, downSpeed = 10, and desiredHeight = 910,
    the output should be
    solution(upSpeed, downSpeed, desiredHeight) = 10.
         */

        int upSpeed = 100, downSpeed = 10, desiredHeight = 910;
        int days = calculateDays(upSpeed,downSpeed,desiredHeight);
        System.out.println(days);
    }

    private static int calculateDays(int upSpeed, int downSpeed, int desiredHeight) {
        int dayspeed = upSpeed - downSpeed;
        int initialSpeed = dayspeed;
        int days=0;
        while(initialSpeed < desiredHeight){
            initialSpeed = initialSpeed + dayspeed;
            // System.out.println(initialSpeed);
            days++;
        }
        return days;
    }
}
