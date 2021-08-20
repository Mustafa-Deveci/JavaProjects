package YoutubeQuestions;

public class QuestionSix {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        do {
            c = a + b;
            if (c > 1000) break;
            System.out.print(c + " - ");
            a = b;
            b = c;
        } while (c < 1000);
    }
}

