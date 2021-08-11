package YoutubeQuestions;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        int i, n, m;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the starting number : ");
        n = s.nextInt();
        System.out.print("enter the ending number : ");
        m = s.nextInt();

        for (i = n; i <= m; i++) {
            if (i % 7 == 0) System.out.println(i + " ");
        }
    }
}
