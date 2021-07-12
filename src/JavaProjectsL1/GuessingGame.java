package JavaProjectsL1;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Write a 2 digit number : ");
        int guess = s.nextInt();
        int luckyNum = (int) (Math.random() * 99 + 1);

        int luckyNumFirstDigit = luckyNum % 10;
        int luckyNumSecondDigit = luckyNum / 10;

        int guessFirstDigit = guess % 10;
        int guessSecondDigit = guess / 10;
        System.out.println("your guess : " + guess + " lucky number : " + luckyNum);

        if (guess == luckyNum) {
            System.out.println("congratulations you earned 1000 points");
        } else if (luckyNumFirstDigit == guessSecondDigit && luckyNumSecondDigit == guessFirstDigit) {
            System.out.println("congratulations you earned 500 points");
        } else if (luckyNumFirstDigit == guessFirstDigit || luckyNumSecondDigit == guessSecondDigit) {
            System.out.println("congratulations you earned 250 points");
        } else {
            System.out.println("you failed, please try again");
        }
    }
}
