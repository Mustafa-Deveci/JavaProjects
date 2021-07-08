package JavaProjectsL1;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 0;
        if (a > b) {
            c = a - b;
        } else {
            c = a + b;
        }
        System.out.println("the value of c : " + c);

        //  w ternary operator
        c = (a > b) ? (a - b) : (a + b);
        System.out.println("the value of c : " + c);
    }
}



