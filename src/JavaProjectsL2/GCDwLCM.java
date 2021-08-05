package JavaProjectsL2;

import java.util.Scanner;

public class GCDwLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int num1 = s.nextInt();
        System.out.print("enter the second number : ");
        int num2 = s.nextInt();

        int lcm = findLCM(num1, num2);
        System.out.println(num1 + " with " + num2 + " lcm : " + lcm);

        findGCD(num1, num2);


    }

    private static void findGCD(int num1, int num2) {
        int gcd = 1;
        int control = 2;
        while (control <= num1 && control <= num2) {
            if (num1 % control == 0 && num2 % control == 0) {
                gcd = control;
            }
            control++;

        }
        if (gcd == 1) {
            System.out.println(num1 + " and " + num2 + " are prime among them");

        } else {
            System.out.println(num1 + " and " + num2 + " gcd : " + gcd);
        }
    }

    public static int findLCM(int num1, int num2) {
        int buyuk = Math.max(num1, num2);
        int lcm = 0;

        for (int i = buyuk; i < num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;

    }
}

