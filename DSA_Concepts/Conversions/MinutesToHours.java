package Conversions;

import java.sql.Time;
import java.time.LocalTime;

public class MinutesToHours {
    public static void main(String[] args) {
        //normal
        int minutes=1400;
        int hour=(int)Math.floor(minutes/60);
        int leftMinutes=minutes%60;
        System.out.println("Time is "+hour+" hour "+leftMinutes+" minutes");

        //Time API
        LocalTime localTime=LocalTime.now();
        int hours=localTime.getMinute()+localTime.getHour()*60;
        System.out.println(hours);


    }
}
