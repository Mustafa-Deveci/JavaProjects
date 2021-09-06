package JavaL3OOP;

public class ExampleTwo {
    public static void main(String[] args) {
        Ogrenci[] tumOgrenciler = new Ogrenci[100];

        for (int i = 0; i < 100; i++) {
            int rastgeleID = (int) (Math.random() * 5000);
            int rastgeleNotDegeri = (int) (Math.random() * 100);

            Ogrenci yeni = new Ogrenci(rastgeleID, rastgeleNotDegeri);
            tumOgrenciler[i] = yeni;
        }
        ogrencileriNotlaraGoreSirala(tumOgrenciler);
        for (int i = 0; i < 100; i++) {
            tumOgrenciler[i].ogrenciBilgileriniYazdır();
        }
    }

    private static void ogrencileriNotlaraGoreSirala(Ogrenci[] tumOgrenciler) {
        for (int i = 0; i < tumOgrenciler.length - 1; i++) {
            int oankiEnBuyukSayi = tumOgrenciler[i].getNotDegeri();
            int oankiEnbuyukElemaninIndex = i;

            for (int j = i + 1; j < tumOgrenciler.length; j++) {
                if (oankiEnBuyukSayi < tumOgrenciler[j].getNotDegeri()) {
                    oankiEnBuyukSayi = tumOgrenciler[j].getNotDegeri();
                    oankiEnbuyukElemaninIndex = j;
                }
            }
            if (oankiEnbuyukElemaninIndex != i) {
                tumOgrenciler[oankiEnbuyukElemaninIndex] = tumOgrenciler[i];
                tumOgrenciler[i].setNotDegeri(oankiEnBuyukSayi);
            }
        }
    }
}

class Ogrenci {
    private int id;
    private int notDegeri;

    public Ogrenci(int id, int notDegeri) {
        this.id = id;
        this.notDegeri = notDegeri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotDegeri() {
        return notDegeri;
    }

    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }

    public void ogrenciBilgileriniYazdır() {
        System.out.println("id : " + id + " not :" + notDegeri);
    }
}
