package JavaProjectsL2;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months = {"ocak ", " şubat ", " mart", " nisan ", " mayıs", "haziran", " temmuz", "ağustos", " eylül", " ekim ", " kasım ", " aralık "};
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the month in which you are : ");
        int month = s.nextInt();
        System.out.println("current month : " + months[month - 1]);
    }
}
