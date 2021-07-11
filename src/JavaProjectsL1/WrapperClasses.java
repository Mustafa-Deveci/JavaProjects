package JavaProjectsL1;

public class WrapperClasses {
    public static void main(String[] args) {
        String stringVariable = "34";
        int integerVariable = Integer.valueOf(stringVariable);
        System.out.println(" string converted to integer " + integerVariable);

        stringVariable = String.valueOf(integerVariable);
        System.out.println(" integer converted to string " + stringVariable);


    }
}
