package JavaL3OOP;

public class ExampleOne {
    public static void main(String[] args) {

        CemberDaire cember1 = new CemberDaire(5);
        System.out.printf("yarıcağı 5 cm olan çemberin çevresi %.2f", cember1.cevreBul());
        System.out.println();
        System.out.printf("yarıcağı 5 cm olan çemberin alanı %.2f", cember1.alanBul());
    }
}

class CemberDaire {
    private int yaricap;
    public final static double PI = 3.14;

    public CemberDaire(int r) {
        this.yaricap = r;
    }

    public double cevreBul() {
        return 2 * PI * yaricap;
    }

    public double alanBul() {
        return PI * Math.pow(yaricap, 2);
    }
}

