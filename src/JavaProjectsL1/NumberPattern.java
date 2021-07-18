package JavaProjectsL1;

public class NumberPattern {
    public static void main(String[] args) {
        // 1 + 2 + 4 + 7 + 11 + 16 + 20 + 23 + 25 + 26 + 28 + 31 + 35 = 229

        int increase = 0;
        boolean isItIncrease = true;
        int toplam = 0;

        for (int i = 1; i <= 35; i = i + increase) {
            System.out.print(i);
            toplam += i;
            if (i != 35) {
                System.out.print(" + ");
            } else {
                System.out.print(" = " + toplam);
            }
            if (increase <= 4 && isItIncrease == true) {
                increase++;
                if (increase == 5) {
                    isItIncrease = false;
                    continue;
                }
            } else {
                increase--;
                if (increase == 1) {
                    isItIncrease = true;
                    continue;
                }
            }

        }
    }
}
