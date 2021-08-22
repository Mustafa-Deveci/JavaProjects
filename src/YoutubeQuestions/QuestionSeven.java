package YoutubeQuestions;

import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        // prime num
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num?");
        int num = s.nextInt();
        int dvdCounter = 0;
        int i, j;

        for (i = 3; i < num; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    dvdCounter++;
                }
            }
                if (dvdCounter == 0) {
                    System.out.print(i + "-");
                }
                dvdCounter = 0;
            }
        }
    }
