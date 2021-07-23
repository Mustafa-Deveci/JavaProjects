package JavaProjectsL2;

public class IndexSquares {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {

            //numbers[index] = index * index;
            numbers[index] = (int) Math.pow(index, 2);
            System.out.println("elements : " + numbers[index]);
        }
    }
}
