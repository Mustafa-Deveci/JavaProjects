package JavaProjectsL2;

public class questionOne {
    public static void main(String[] args) {
        /*5*5 bir matris oluşturun ve bu matris elemanları 0-9 arasında rastgele sayılar olsun
        bu matrisi ekrana yazdıran ve çapraz elemanların toplamını gösteren prgramı yazınız
*/

        int[][] arr = new int[5][5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + "   ");
            }
            total += arr[i][i];
            System.out.println();
        }
        System.out.println("sum of cross : " + total);
    }
}
