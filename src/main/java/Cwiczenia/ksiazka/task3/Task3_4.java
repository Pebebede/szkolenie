package Cwiczenia.ksiazka.task3;

import java.util.Random;
import java.util.Scanner;

public class Task3_4 {

    /*
zaprogramowanie gry "odganij moją liczbe"
1. info że komp mysli o liczbie od 1 do 100
2. podaj liczbe
3. zczytanie liczby, sout
4. sout liczby wylosowanej randomem
5.roznica

     */

    public void runGame() {
        execute();
    }

    private void execute() {
        String loopBreak;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("I think about number between 1 to 100, lets think what number it can be?");
            System.out.println("Write your proposal from 1 to 100");
            Integer proposalNumber = in.nextInt();
            Integer imaginaryNumber = generateNumber();
            resultEstimating(proposalNumber, imaginaryNumber);
            System.out.println("Do you want to play again? y -yes n-no");
            loopBreak = in.next();
        } while (!loopBreak.equals("n"));
    }

    private void resultEstimating(Integer proposal, Integer imaginary) {
        if (proposal == imaginary) {

            notificationVictory();
        } else {
            loseNotification(proposal, imaginary);

        }
    }

    private void loseNotification(Integer proposal, Integer imaginary) {
        if (proposal > imaginary) {
            System.out.println("My number was: " + imaginary + " but your was: " + proposal);
            System.out.println("Sorry, but not this time, difference between scores are: " + (proposal - imaginary));
        } else {
            System.out.println("My number was: " + imaginary + " but your was: " + proposal);
            System.out.println("Sorry, but not this time, difference between scores are: " + (imaginary - proposal));
        }
    }

    private void notificationVictory() {
        System.out.println("Congratulation! You are a WINNER!");
    }

    private Integer generateNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
