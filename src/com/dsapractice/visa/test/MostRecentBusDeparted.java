package com.dsapractice.visa.test;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MostRecentBusDeparted {
    public static void main(String[] args) {
        String deptimes[] = {"12:30","14:00","19:55"};
        String currentTime="14:30";
        String diff = findDiffInTime(deptimes,currentTime);
        System.out.println(diff);
    }

    private static String findDiffInTime(String[] deptimes, String currentTime) {
        int mindiffInMin = -1;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime currTime = LocalTime.parse(currentTime,dtf);
        for(String str : deptimes){
            LocalTime depTime = LocalTime.parse(str,dtf);
            if(depTime.isBefore(currTime)){
               int diffInMin = (int) Duration.between(depTime,currTime).toMinutes();
               if(mindiffInMin == -1 || diffInMin < mindiffInMin){
                   mindiffInMin = diffInMin;
               }
            }
        }
        return mindiffInMin+"";
    }
}
