package JavaProjectsL1;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your grade : ");
        int grade = s.nextInt();
        int letterGrade = grade / 10;

        if (grade == 100) {
            letterGrade = 9;
        }
        switch (letterGrade) {
            case 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("BA");
                break;
            case 7:
                System.out.println("BB");
                break;
            case 6:
                System.out.println("CB");
                break;
            case 5:
                System.out.println("CC");
                break;
            case 4:
                System.out.println("DC");
                break;
            case 3:
                System.out.println("DD");
                break;
            case 2, 1:
                System.out.println("FF");
                break;
            default:
                System.out.println("You entered incorrectly.");
                break;
        }

    }
}
