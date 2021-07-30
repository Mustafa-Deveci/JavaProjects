package JavaProjectsL2;

public class SmallestLargest {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        int smallestNumber = 900, largestNumber = 0;
        for (int line = 0; line < numbers.length; line++) {
            for (int column = 0; column < numbers[line].length; column++) {
                int randomNumber = (int) (Math.random() * 100);
                numbers[line][column] = randomNumber;
                System.out.println(line + ". satırdaki " + column + ". sütündaki " + numbers[line][column]);

                if (smallestNumber > randomNumber) {
                    smallestNumber = randomNumber;
                }
                if (largestNumber < randomNumber) {
                    largestNumber = randomNumber;
                }
            }
        }
        System.out.println("smallest : " + smallestNumber + " largest : " + largestNumber);
    }
}
