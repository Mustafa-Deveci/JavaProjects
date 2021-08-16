package YoutubeQuestions;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter words in lowercase characters : ");
        String word = s.nextLine();
        int vowel = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {
                vowel++;
            }
        }
        System.out.println("number of vowels : " + vowel);
        System.out.println("number of consonant :" + (word.length() - vowel));
    }
}
