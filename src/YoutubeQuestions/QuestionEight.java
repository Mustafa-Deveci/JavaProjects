package YoutubeQuestions;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("how many numbers do you want to find the average? ");
        int counter = s.nextInt();
        int oddNum = 0;
        int evenNum = 0;
        int oddTotal = 0;
        int evenTotal = 0;
        float oddAverage = 0;
        float evenAverage = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".number : ");
            int num = s.nextInt();

            if (num % 2 == 0) {
                evenNum++;
                evenTotal += num;
            } else {
                oddNum++;
                oddTotal += num;
            }
        }
        oddAverage = (float) oddTotal / (float) oddNum;
        evenAverage = (float) evenTotal / (float) evenNum;
        System.out.println("number of odd numbers: " + oddNum + " sum of odd numbers: " + oddTotal + " average of odd numbers: " + oddAverage);
        System.out.println("number of even numbers: " + evenNum + " sum of even numbers: " + evenTotal + " average of even numbers: " + evenAverage);
    }
}
