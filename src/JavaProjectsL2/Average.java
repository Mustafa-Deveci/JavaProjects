package JavaProjectsL2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("how many numbers did you think about the average? ");
        int num = s.nextInt();
        int[] userNumbers = new int[num];
        double average = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("enter number : ");
            userNumbers[i] = s.nextInt();
            average += userNumbers[i];
        }
        System.out.println("the average of the numbers you entered =  " + (average / userNumbers.length));
    }
}
