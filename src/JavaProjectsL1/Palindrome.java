package JavaProjectsL1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a word ");
        String word = s.nextLine();

        int lowerLimit = 0;
        int upperLimit = word.length() - 1;
        boolean isItpalindrome = true;

        while (lowerLimit < upperLimit) {
            if (word.charAt(lowerLimit) != word.charAt(upperLimit)) {
                isItpalindrome = false;
                break;
            }
            lowerLimit++;
            upperLimit--;

        }
        if (isItpalindrome) {
            System.out.println(word + "is a palindrome");
        } else {
            System.out.println(word + "is not a palindrome");
        }
    }
}
