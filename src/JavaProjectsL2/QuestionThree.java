package JavaProjectsL2;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of lines : ");
        int line = s.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (i == j || j == (line - i - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
