package Cwiczenia.ksiazka.task2;

public class Main {


    public static void main(String[] args) {
        Task2_3 task = new Task2_3();

        final int hour = 17;
        final int minute = 10;
        final int second = 15;
        final int daySecond = 86400;


        Integer secondsFromMidnight = task.timeElapsed(hour, minute, second);
        System.out.println(secondsFromMidnight);
        Integer secondsToMidnight = task.timeLeft(hour, minute, second);
        System.out.println(secondsToMidnight);
        Double percentageTimeLeft = task.dayPercentageLeft(secondsFromMidnight, daySecond);
        System.out.println("elapsed " + percentageTimeLeft + "% of the day");
        task.timeLeftFromStart(hour, minute, second);
    }


}
