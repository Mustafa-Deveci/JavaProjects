package YoutubeQuestions;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the word you want reversed : ");
        String word = s.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
