package YoutubeQuestions;
import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args) {
        int i, n, total;
        Scanner s = new Scanner(System.in);
        System.out.print("enter number  : ");
        n = s.nextInt();

        total = 0;
        for (i = 0; i < n; i++) {
            if (i % 2 == 1) {
                total += i;
            }
        }
        System.out.println("1 - " + n + " sum of odd numbers : " + total);
    }
}
