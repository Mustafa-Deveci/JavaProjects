package JavaProjectsL1;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the 1st number : ");
        int num1 = s.nextInt();

        System.out.println("enter the 2nd number : ");
        int num2 = s.nextInt();
        int gcd = 1;
        int control = 2;
        while (control <= num1 && control <= num2) {
            if (num1 % control == 0 && num2 % control == 0) {
                gcd = control;
            }
            control++;

        }
        if (gcd == 1) {
            System.out.println(num1 + "and" + num2 + "are prime among them");

        } else {
            System.out.println(num1 + "and" + num2 + "gcd : " + gcd);
        }
    }
}
