package com.dsapractice.testques;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;

public class MostRecentBusLeft {
    public static void main(String[] args) {
        String departureTimes[]={"12:30","14:15","14:25"};
        String currTime="14:30";
        int minutes = mostRecentBusLeftInMinutes(departureTimes,currTime);
        System.out.println(minutes);
    }

    private static int mostRecentBusLeftInMinutes(String[] departureTimes, String currTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime currtime = LocalTime.parse(currTime,dtf);
        int mindiffinMins = -1;
        for(String s : departureTimes){
            LocalTime depTime = LocalTime.parse(s,dtf);
            if(depTime.isBefore(currtime)){
                int diffInMins = (int) Duration.between(depTime,currtime).toMinutes();
                if(mindiffinMins == -1 || diffInMins < mindiffinMins){
                    mindiffinMins = diffInMins;
                }
            }
        }
        return mindiffinMins;
    }
}
