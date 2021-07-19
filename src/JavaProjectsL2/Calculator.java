package JavaProjectsL2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int userChoice = -1;
        while (userChoice != 0) {
            userChoice = showMenu();
            Scanner s = new Scanner(System.in);
            System.out.println("enter the first number : ");
            int num1 = s.nextInt();

            System.out.println("enter the second number : ");
            int num2 = s.nextInt();

            switch (userChoice) {
                case 1:
                    sumTwoNums(num1, num2);
                    break;
                case 2:
                    int difference = differenceTwoNums(num1, num2);
                    System.out.println("difference of 2 numbers =" + difference);
                    break;
                case 3:
                    multiplicationTwoNums(num1, num2);
                    break;
                case 4:
                    int division = divisionTwoNums(num1, num2);
                    System.out.println("division of two numbers" + division);
                    break;
                case 5:
                    powerTwoNums(num1, num2);
                    break;
            }
        }
    }

    public static void sumTwoNums(int num1, int num2) {
        System.out.println("sum of two numbers : " + (num1 + num2));
    }

    public static int differenceTwoNums(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }

    public static void multiplicationTwoNums(int num1, int num2) {
        System.out.println("multiplication of two numbers : " + (num1 * num2));
    }

    public static int divisionTwoNums(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public static void powerTwoNums(int num1, int num2) {
        double power = Math.pow(num1, num2);
        System.out.println("power of the two numbers : " + power);
    }

    public static int showMenu() {
        System.out.println("****** MENU *******");
        System.out.println("1 - find the sum of two numbers : ");
        System.out.println("2 - find the difference of two numbers : ");
        System.out.println("3 - find the multiplication of two numbers : ");
        System.out.println("4 - find the division of two numbers : ");
        System.out.println("5 - find the power of two numbers : ");
        System.out.println("press 0 to exit : ");

        Scanner s = new Scanner(System.in);
        System.out.println(" select the action you want to do : ");
        int choie = s.nextInt();
        return choie;

    }
}


