package JavaProjectsL2;

public class AverageWithArray {
    public static void main(String[] args) {
        //Create an array with 100 elements and randomly generate all the elements of this array. After this process, calculate the average of the elements in the array and print how many elements are below this average.

        int[] numbers = new int[100];
        int sumOfAllNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = (int) (Math.random() * 100);
            numbers[i] = randomNum;
            sumOfAllNumbers += randomNum;

        }
        double average = (double) sumOfAllNumbers / (double) numbers.length;
        int belowAverage = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                System.out.print(numbers[i] + ",");
                belowAverage++;

            }
        }
        System.out.println(" average = " + average + " number of values below average : " + belowAverage);
    }
}
