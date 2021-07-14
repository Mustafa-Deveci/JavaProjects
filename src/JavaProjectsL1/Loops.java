package JavaProjectsL1;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop : " + i);

        }
        int counter = 0;
        while (counter < 10) {
            System.out.println("while loop : " + counter);
            counter++;
        }
        int counter2 = 0;
        do {
            System.out.println("do while loop : " + counter2);
            counter2++;

        } while (counter2 < 10);
    }
}

