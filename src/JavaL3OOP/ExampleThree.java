package JavaL3OOP;

public class ExampleThree {
    public static void main(String[] args) {
        System.out.println("topla : " + HesapMakinesi.topla(10, 20, 30, 20, 20, 10, 50, 60));
        System.out.println("fark : " + HesapMakinesi.cikar(100, 50, 20));
        System.out.println("carpım : " + HesapMakinesi.carp(1, 50, 2));
        if (HesapMakinesi.bol(0, 5, 2) != -1) {
            System.out.println("böl : " + HesapMakinesi.bol(0, 5, 2));
        } else {
            System.out.println("tanımsız");
        }
    }
}

class HesapMakinesi {
    public static int topla(int... parametreler) {
        int toplam = 0;
        for (int parametre : parametreler) {
            toplam += parametre;
        }
        return toplam;
    }

    public static int cikar(int... parametreler) {
        int fark = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            fark = fark - parametreler[i];
        }
        return fark;
    }

    public static int carp(int... parametreler) {
        int carpim = 1;
        for (int parametre : parametreler) {
            carpim = carpim * parametre;
        }
        return carpim;
    }

    public static double bol(int... parametreler) {
        int bolum = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            if (parametreler[i] != 0) {
                bolum = bolum / parametreler[i];
            } else {
                return -1;
            }
        }
        return bolum;
    }
}
