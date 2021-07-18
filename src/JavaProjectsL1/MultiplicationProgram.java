package JavaProjectsL1;

import java.util.Scanner;

public class MultiplicationProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value press 0 to multiply");

        int userValue = s.nextInt();
        int MultiplicationResult = 1;
        boolean isItOut = true;

        while (userValue != 0) {
            MultiplicationResult *= userValue;
            System.out.println("enter a value press 0 to multiply");
            userValue = s.nextInt();
            isItOut = false;
        }
        if (isItOut) {
            System.out.println("you just exited the app");
        } else {
            System.out.println("multiplication of the numbers you entered : " + MultiplicationResult);
        }
    }
}
