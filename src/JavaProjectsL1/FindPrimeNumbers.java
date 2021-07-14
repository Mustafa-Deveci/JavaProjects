package JavaProjectsL1;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = s.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isItPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isItPrime = false;
                    break;
                }
            }
            if (isItPrime) {
                System.out.print(i + ",");
            }
        }
    }
}





