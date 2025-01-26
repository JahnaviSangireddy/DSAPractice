package com.dsapractice.arrays;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MinTimeDifference {
    public static void main(String[] args) {
        String deptTimes[]={"16:40","14:00","12:45"};
        String currtime="14:30";
        int min = findMinTimeDiff(deptTimes,currtime);
        System.out.println(min);
    }

    private static int findMinTimeDiff(String[] deptTimes, String currtime) {
        int minDiffInMins = -1;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime currTime = LocalTime.parse(currtime,dtf);
        for(String s : deptTimes){
            LocalTime deptTime = LocalTime.parse(s,dtf);
            if(deptTime.isBefore(currTime)){
                int diffInMins = (int) Duration.between(deptTime,currTime).toMinutes();
                if(minDiffInMins==-1 || diffInMins<minDiffInMins){
                    minDiffInMins = diffInMins;
                }
            }
        }
        return minDiffInMins;
    }
}
