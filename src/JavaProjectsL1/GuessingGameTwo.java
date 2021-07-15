package JavaProjectsL1;

import java.util.Scanner;

public class GuessingGameTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int producedNumber = (int) (Math.random() * 101);
        int guess = -1;
        int numberOfGuesses = 0;
        while (guess != producedNumber) {
            System.out.print("guess the number : ");
            guess = s.nextInt();
            numberOfGuesses++;

            if (guess == producedNumber) {
                System.out.println("Congratulations " +"you found it on the " + numberOfGuesses + ". try");
            } else if (guess > producedNumber) {
                System.out.println("guess a smaller number");
            } else {
                System.out.println("guess a bigger number");
            }
        }
    }
}
