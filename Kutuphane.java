public class Kutuphane{

    public String adres;
    public Kitap[] kitaplar;
    private int kitapSayisi = 0;
    private String kitapAdi;
    public boolean oduncVerildi;

    public Kutuphane() {

    }

    public void Kitap(String ad) {
        this.kitapAdi = ad;
        this.oduncVerildi = false;
    }

    public String getkitapAdi() {
        return this.kitapAdi;
    }

    public boolean oduncVerildi() {
        return this.oduncVerildi;
    }

    public void setOduncVerildi(boolean oduncVerildi) {
        this.oduncVerildi = oduncVerildi;
    }

    public void kitapEkle(Kitap kitap) {
        if (kitapSayisi < kitaplar.length) {
            kitaplar[kitapSayisi] = kitap;
            kitapSayisi++;
        }
    }

    public static void acikSaatleriYazdir(){
        System.out.println("Kütüphaneler her gün 09:00-17:00 saatleri arasında açıktır.");
    }

    public Kutuphane(String adres){
        this.adres = adres;
        this.kitaplar = new Kitap[10];
        for (int i = 0; i < kitaplar.length; i++) {
            kitaplar[i] = new Kitap("Kitap " + (i + 1));
        }
    }


    public void adresYazdir(){
        System.out.println( this.adres);
    }

    public void kitapOduncAl(String kitapAdi) {
        boolean kitapBulundu = false;
        for (int i = 0; i < kitapSayisi; i++) {
            if (kitaplar[i] != null && kitaplar[i].getkitapAdi().equals(kitapAdi)) {
                if (kitaplar[i].oduncVerildi) {
                    System.out.println("Uzgunum, bu kitap zaten odunc verilmistir.");
                } else {
                    kitaplar[i].oduncVerildi = true;
                    System.out.println("\"Olasiliksiz\" kitabini basarili bir sekilde odunc aldiniz.");
                }
                kitapBulundu = true;
                break;
            }
        }
        if (!kitapBulundu) {
            System.out.println("Uzgunum, bu kitap katalogumuzda bulunmamamktadir.");
        }
    }


    public void mevcutKitaplariYazdir(){
        if(kitapSayisi == 0){
            System.out.println("Katalogta kitap bulunmamaktadir.");
        }else{

            for (int i = 0; i < kitapSayisi; i++) {
                if(kitaplar[i] != null){
                System.out.println(kitaplar[i].getkitapAdi());
                }else{
                    System.out.println("Katalogta kitap bulunmamaktadir.");
                }
                }
            }
    }


    public static void kitapIadeEt(String kitap){
        System.out.println("\"" + kitap + "\"" + " kitabini basarili bir sekilde iade ettiniz ");
    }


    public static void main(String[] args) {
        // İki kütüphane yaratın.
        Kutuphane birinciKutuphane = new Kutuphane("Atatürk Bulvarı");
        Kutuphane ikinciKutuphane = new Kutuphane("Kurtuluş Bulvarı");
        // Birinci kütüphaneye dört kitap ekleyin.
        birinciKutuphane.kitapEkle(new Kitap("Olasılıksız"));
        birinciKutuphane.kitapEkle(new Kitap("Empati"));
        birinciKutuphane.kitapEkle(new Kitap("Kaiken"));
        birinciKutuphane.kitapEkle(new Kitap("Mesaj"));
        // Kütüphane açık saatlerini yazdırın.
        System.out.println("Kütüphane saatleri:");
        acikSaatleriYazdir();
        System.out.println();
        // Kütüphanelerin adreslerini yazdırın.
        System.out.println("Kütüphane adresleri:");
        birinciKutuphane.adresYazdir();
        ikinciKutuphane.adresYazdir();
        System.out.println();
        // Her iki kütüphaneden "Olasılıksız" kitabını ödünç almayı deneyin.
        System.out.println("\"Olasılıksız\" kitabı ödünç alınıyor:");
        birinciKutuphane.kitapOduncAl("Olasılıksız");
        birinciKutuphane.kitapOduncAl("Olasılıksız");
        ikinciKutuphane.kitapOduncAl("Olasılıksız");
        System.out.println();
        // Her kütüphanedeki mevcut kitapların adlarını yazdırın.
        System.out.println("Birinci kütüphanedeki mevcut kitaplar:");
        birinciKutuphane.mevcutKitaplariYazdir();
        System.out.println();
        System.out.println("İkinci kütüphanedeki mevcut kitaplar:");
        ikinciKutuphane.mevcutKitaplariYazdir();
        System.out.println();
        // Birinci kütüphaneye "Olasılıksız" kitabını iade edin.
        System.out.println("\"Olasılıksız\" kitabı iade ediliyor:");
        birinciKutuphane.kitapIadeEt("Olasılıksız");
        System.out.println();
        // Birinci kütüphanedeki mevcut kitapların adlarını yazdırın.
        System.out.println("Birinci kütüphanedeki mevcut kitaplar:");
        birinciKutuphane.mevcutKitaplariYazdir();
    }
}