package JavaProjectsL1;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" Value of edge one : ");
        int sideOne = s.nextInt();

        System.out.print(" Value of edge two : ");
        int sideTwo = s.nextInt();

        System.out.print(" Value of edge three : ");
        int sideThree = s.nextInt();

        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println(" Equilateral triangle ");

        } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            System.out.println(" İsosceles triangle ");
        } else
            System.out.println(" Scalene triangle ");
    }
}
