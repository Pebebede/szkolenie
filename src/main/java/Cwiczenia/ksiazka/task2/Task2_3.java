package Cwiczenia.ksiazka.task2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task2_3 {
    //   private CurrentTimeCreator actualTime = new CurrentTimeCreator();


    protected Integer timeElapsed(int hour, int minute, int second) {

        return (hour * 60 * 60) + (minute * 60) + (second);

    }


    protected Integer timeLeft(int hour, int minute, int second) {
        return ((24 - hour) * 60 * 60) - (minute * 60) - (second);
    }

    protected Double dayPercentageLeft(Integer timeElapsed, Integer daySeconds) {
        Double operandA = timeElapsed.doubleValue();
        Double operandB = daySeconds.doubleValue();
        Double value = operandA / operandB;

        return value * 100;
    }


    protected void timeLeftFromStart(int startHour, int startMinute, int startSecondAsSeconds) {

        Integer startHourAsSeconds = startHour * 60 * 60;
        Integer startMinuteAsSeconds = startMinute * 60;

        Long startTimeInSeconds = (startHourAsSeconds.longValue() + startMinuteAsSeconds.longValue() + startSecondAsSeconds);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.minus(startTimeInSeconds, ChronoUnit.SECONDS));
    }


}
