package JavaProjectsL1;

public class ForLoops {
    public static void main(String[] args) {
        oFor:
        for (int i = 0; i < 5; i++) {

            iFor:
            for (int j = 0; j < 3; j++) {
                System.out.println(" i :" + i + " j :" + j);
                if (i == 1 && j == 2) {
                    break oFor;

                }
            }
        }
    }
}
