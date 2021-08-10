package YoutubeQuestions;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        int a, b, c, delta;
        float rootOne, rootTwo;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number a : ");
        a = s.nextInt();
        System.out.println("enter the number b : ");
        b = s.nextInt();
        System.out.println("enter the number c : ");
        c = s.nextInt();

        delta = b * b - (4 * a * c);
        if (delta > 0) {
            System.out.println("equation has 2 roots : ");
            rootOne = (float) ((-b - Math.sqrt(delta)) / 2 * a);
            rootTwo = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("root one = " + rootOne + "root two =" + rootTwo);
        } else if (delta == 0) {
            System.out.println("the equation has coincident root : ");
            rootOne = (float) (-b) / 2 * a;
            System.out.println("coincident root : " + rootOne);
        } else {
            System.out.println("equation has no root. ");
        }
    }
}
