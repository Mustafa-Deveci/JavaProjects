package JavaProjectsL1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weight");
        double kilo = s.nextDouble();

        System.out.println("Enter your height");
        double boy = s.nextDouble();

        double bmi = kilo / (Math.pow((boy / 100), 2));
        System.out.println("body mass index : " + bmi);
        if (bmi < 15) {
            System.out.println("very seriously underweight");
        } else if (bmi < 16 && bmi > 15) {
            System.out.println("seriously underweight");
        } else if (bmi < 18.5 && bmi > 16) {
            System.out.println("underweight");
        } else if (bmi < 25 && bmi > 18.5) {
            System.out.println("normal weight");
        } else if (bmi < 30 && bmi > 25) {
            System.out.println("overweight");
        } else if (bmi < 35 && bmi > 30) {
            System.out.println("1st degree obese");
        } else if (bmi < 40 && bmi > 35) {
            System.out.println("2nd degree obese");
        } else {
            System.out.println("extremely obese");
        }
    }
}
