package JavaProjectsL1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = s.nextInt();

        int counter = 1;
        int factorial = 1;
        while (counter <= num) {
            factorial *= counter;
            counter++;
        }
        System.out.println(num + " factorial : " + factorial);
    }
}
