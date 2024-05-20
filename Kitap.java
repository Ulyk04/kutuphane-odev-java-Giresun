public class Kitap extends Kutuphane {
    private String kitapAdi;
    private boolean oduncAlindi;
    private String ad;

    public Kitap(String kitapAdi) {
        this.kitapAdi = kitapAdi;
        this.oduncAlindi = false;
    }

    public String getkitapAdi(){
        return this.kitapAdi;
    }

    // Kitabı ödünç alındı olarak işaretler.
    public void oduncAl() {
        this.oduncAlindi = true;
    }

    // Kitabı ödünç alınmadı olarak işaretler.
    public void iadeEt() {
        this.oduncAlindi = false;
    }

    // Kitap ödünç alındıysa “true”, ödünç alınmadıysa “false” değerini döndürür.
    public boolean oduncAlindiMi() {
        return this.oduncAlindi;
    }

    // Kitap adını geri döndürür.
    public String getKitapAdi() {
        return this.kitapAdi;
    }
    public static void main(String[] args) {
        // Kitap sınıfı testi
        Kitap ornek = new Kitap("Olasılıksız");
        System.out.println("Kitap adı: " + ornek.getKitapAdi());
        System.out.println("Ödünç alındı mı? : " + ornek.oduncAlindiMi());
        ornek.oduncAl();
        System.out.println("Ödünç alındı mı? : " + ornek.oduncAlindiMi ());
        ornek.iadeEt();
        System.out.println("Ödünç alındı mı? : " + ornek.oduncAlindiMi ());
    }

}
