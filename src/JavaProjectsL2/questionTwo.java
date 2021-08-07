package JavaProjectsL2;

import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        // 7 sayısını 111 olarak binary halini yazma
        Scanner s = new Scanner(System.in);
        System.out.print("enter a decimal number : ");
        int decimalNum = s.nextInt();
        String binaryNum = "";
        if (decimalNum == 0) {
            binaryNum = "0";
        }
        while (decimalNum > 0) {
            int mod = decimalNum % 2;
            binaryNum = mod + binaryNum;
            decimalNum = decimalNum / 2;
        }
        System.out.println("decimal to binary : " + binaryNum);
    }
}
