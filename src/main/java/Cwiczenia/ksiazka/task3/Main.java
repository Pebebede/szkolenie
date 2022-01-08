package Cwiczenia.ksiazka.task3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        task3_1();
//        System.out.println("");
//        measureConverter();
        //    secondsConverter();
        new Task3_4().runGame();
    }

    private static void task3_1() {
        int value = 10;
        double doubleValue = 20.0;
        System.out.printf("%.3f wartosc %f wartosc2", doubleValue, doubleValue);

    }

    private static void measureConverter() {
        Double celsius;
        Double fahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, write your value in Celsius to convert it in to Fahrenheit");
        celsius = in.nextDouble();
        fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.1f degrees celsius its a %.1f degrees fahrenheit ", celsius, fahrenheit);

    }

    private static void secondsConverter() {
        Scanner in = new Scanner(System.in);
        Integer secondsValue;
        Integer hours, hoursRest;
        Integer minutes, minutesRest;

        System.out.println("Please, write value in seconds to check how many is hours, minutes and seconds");
        secondsValue = in.nextInt();
        minutes = secondsValue / 60;
        minutesRest = secondsValue % 60;
        hours = minutes / 60;
        hoursRest = minutes % 60;
        System.out.printf("%d seconds is %d hours, %d minutes, %d seconds", secondsValue, hours, hoursRest, minutesRest);
    }

}
