package JavaProjectsL1;

import java.util.Scanner;

public class PassingGrade {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" midterm exam ? ");
        int midtermE = s.nextInt();
        System.out.println("final exam ?");
        int finalE = s.nextInt();

        double passingGrade = (midtermE * 0.4) + (finalE * 0.6);

        if (passingGrade > 50) {
            System.out.println("you passed the lesson successfully. your average : " + passingGrade);

        } else {
            System.out.println("unfortunately you failed. your average : " + passingGrade);
        }
    }
}
