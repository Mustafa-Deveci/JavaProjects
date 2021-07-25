package JavaProjectsL2;

public class CopyArray {
    public static void main(String[] args) {
        //manual string copying
        int[] arrayOne = {1, 2, 3, 4};
        int[] copyArrayOne = new int[arrayOne.length];

        for (int index = 0; index < arrayOne.length; index++) {
            copyArrayOne[index] = arrayOne[index];

        }
        printArray(copyArrayOne);

        //w arraycopy
        int[] copyArrayTwo = new int[arrayOne.length];
        System.arraycopy(arrayOne, 0, copyArrayTwo, 0, arrayOne.length);
        printArray(copyArrayTwo);
    }

    public static void printArray(int[] arrayToPrint) {
        for (int arr : arrayToPrint) {
            System.out.println("copied array element" + arr);

        }
    }
}
