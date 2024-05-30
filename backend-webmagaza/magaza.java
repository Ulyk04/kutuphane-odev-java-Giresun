import java.util.Scanner;
import java.util.ArrayList;

public class magaza {
    static kiyafet Kiyafet = new kiyafet();
    static yemek Yemek = new yemek();
    static makyaj Makyaj = new makyaj();
    static ArrayList ar = new ArrayList<>();
    static ArrayList arr = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            sayfa();
            int secim = sc.nextInt();
            if(secim == 1){
                makyajSayfasi();
                int s = sc.nextInt();
                if(s==1){
                    TonikSayfa();
                }
                if (s==2){
                    KoprukSayfa();
                }
                if (s==3){
                    KremSayfa();
                }
            }
//------------------------------------------------------------------------------
            if (secim == 2){
                kiyafetSayfasi();
                int s = sc.nextInt();
                if (s==1){
                    elbiseSayfa();
                }
                if (s==2){
                    ayakkabiSayfa();
                }
                if (s == 3){
                    pantalonSayfa();
                }
            }
//--------------------------------------------------------------------------------
            if (secim == 3){
                yemekSayfasi();
                int s = sc.nextInt();
                if (s == 1){
                    tantuniSayfa();
                }
                if (s==2){
                    durumSayfa();
                }
                if (s == 3){
                    iskenderSayfa();
                }
            }
//------------------------------------------------------------------------------------
            if (secim == 4){
                Sepet();
            }
//------------------------------------------------------------------------------------
            if (secim == 5){
                break;
            }
        }
    }

    public static void sayfa(){
        System.out.println();
        System.out.println("Magazamiza hos geldiniz");
        System.out.println("Hangi urunu istersiniz:");
        System.out.println("1)Makyaj");
        System.out.println("2)Kiyafet");
        System.out.println("3)Yemek");
        System.out.println("4)Sepeti gormek");
        System.out.println("6)Cikis");
    }

    public static void makyajSayfasi(){
        System.out.println("Makyaj urunleri sayfamiza hos geldiniz");
        System.out.println("Urunlerimiz:");
        System.out.println("1) Tonik");
        System.out.println("2) Kopruk");
        System.out.println("3) Krem");
    }

    public static void kiyafetSayfasi(){
        System.out.println("Kiyafet sayfamiza hos geldiniz");
        System.out.println("Urunlerimiz");
        System.out.println("1) Bayan elbisesi");
        System.out.println("2) Bay ayakkabi");
        System.out.println("3) Bayan pantalon");
    }

    public static void yemekSayfasi(){
        System.out.println("Yemek sayfamiza hos geldiniz");
        System.out.println("Urunlerimiz");
        System.out.println("1) Tantuni");
        System.out.println("2) Doner durum");
        System.out.println("3) Iskender");
    }

    public static void TonikSayfa(){
        Scanner sc = new Scanner(System.in);
        Makyaj.Tonik();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Makyaj urunleri gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Tonik");
            arr.add(100);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if(n==2){
            makyajSayfasi();
            int s = sc.nextInt();
            if(s==1){
                TonikSayfa();
            }
            if (s==2){
                KoprukSayfa();
            }
            if (s==3){
                KremSayfa();
            }
        }
    }

    public static void KoprukSayfa(){
        Scanner sc = new Scanner(System.in);
        Makyaj.Kopruk();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Makyaj urunleri gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Kopruk sabun");
            arr.add(150);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if(n==2){
            makyajSayfasi();
            int s = sc.nextInt();
            if(s==1){
                TonikSayfa();
            }
            if (s==2){
                KoprukSayfa();
            }
            if (s==3){
                KremSayfa();
            }
        }
    }
    public static void KremSayfa(){
        Scanner sc = new Scanner(System.in);
        Makyaj.Krem();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Makyaj urunleri gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Nemlendirici krem");
            arr.add(150);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if(n==2){
            makyajSayfasi();
            int s = sc.nextInt();
            if(s==1){
                TonikSayfa();
            }
            if (s==2){
                KoprukSayfa();
            }
            if (s==3){
                KremSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void elbiseSayfa(){
        Scanner sc = new Scanner(System.in);
        Kiyafet.Elbise();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Kiyafetleri gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Bayan elbisesi");
            arr.add(500);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if (n == 2){
            kiyafetSayfasi();
            int s = sc.nextInt();
            if (s==1){
                elbiseSayfa();
            }
            if (s==2){
                ayakkabiSayfa();
            }
            if (s == 3){
                pantalonSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void ayakkabiSayfa(){
        Scanner sc = new Scanner(System.in);
        Kiyafet.Ayakkabi();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Kiyafetleri gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Bay ayakkabi");
            arr.add(550);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if (n == 2){
            kiyafetSayfasi();
            int s = sc.nextInt();
            if (s==1){
                elbiseSayfa();
            }
            if (s==2){
                ayakkabiSayfa();
            }
            if (s == 3){
                pantalonSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void pantalonSayfa(){
        Scanner sc = new Scanner(System.in);
        Kiyafet.Pantalon();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Kiyafetleri gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Bayan elbisesi");
            arr.add(450);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if (n == 2){
            kiyafetSayfasi();
            int s = sc.nextInt();
            if (s==1){
                elbiseSayfa();
            }
            if (s==2){
                ayakkabiSayfa();
            }
            if (s == 3){
                pantalonSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void tantuniSayfa(){
        Scanner sc = new Scanner(System.in);
        Yemek.Tantuni();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Yemek cesidini gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Tantuni");
            arr.add(120);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if (n == 2){
            yemekSayfasi();
            int s = sc.nextInt();
            if (s == 1){
                tantuniSayfa();
            }
            if (s==2){
                durumSayfa();
            }
            if (s == 3){
                iskenderSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void durumSayfa(){
        Scanner sc = new Scanner(System.in);
        Yemek.Durum();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Yemek cesidini gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Durum");
            arr.add(80);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if (n == 2){
            yemekSayfasi();
            int s = sc.nextInt();
            if (s == 1){
                tantuniSayfa();
            }
            if (s==2){
                durumSayfa();
            }
            if (s == 3){
                iskenderSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void iskenderSayfa(){
        Scanner sc = new Scanner(System.in);
        Yemek.Iskender();
        System.out.println("1) Urunu sepete eklemek istiyorum");
        System.out.println("2) Yemek cesidini gormek istiyorum");
        System.out.println("3) Ana sayfayi gormek istiyorum");
        int n = sc.nextInt();
        if (n==1){
            ar.add("Iskender");
            arr.add(60);
            System.out.println("Urun sepete basarili bir sekilde eklendi");
            System.out.println("Sizi ana sayfaya gonderiyorum => (ok)");
            String ok = sc.next();
        }
        if (n == 2){
            yemekSayfasi();
            int s = sc.nextInt();
            if (s == 1){
                tantuniSayfa();
            }
            if (s==2){
                durumSayfa();
            }
            if (s == 3){
                iskenderSayfa();
            }
        }
        if (n==3){
            sayfa();
        }
    }

    public static void Sepet(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Sizin aldiginiz urunler");
        for (Object element : ar){
            System.out.println("-" + element + "-");
        }
        int total = 0;
        for(Object elem : arr){
            total += (int)elem;
        }
        System.out.println("Toplam tutar:" + total);
        System.out.println();
        System.out.println("Devam etmek ister misiniz => Evet/Hayir");
        String ok = sc.next();
        if(ok == "Evet" || ok == "evet"){
            sayfa();
        }
        else{
            System.exit(0);
        }
    }
}
