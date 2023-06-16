import java. util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int kM, yas, yolculukTipi;
        double mesafeBasi = 0.10, NormalTutar, YasindirimliTutar,indirimliTutar,BiletIndirimi,ToplamTutar;
        //boolean issError = true;

        System.out.print("Mesafenizi Giriniz: ");
        kM = imp.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = imp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = imp.nextInt();

        if ((yolculukTipi != 1) && ((yolculukTipi != 2))) {
            System.out.print("Hatalı Veri Girdiniz !");
        }

        else {
            if (yas < 12) {
                NormalTutar = mesafeBasi * kM;
                YasindirimliTutar= 0.50 * NormalTutar;
                indirimliTutar= NormalTutar- YasindirimliTutar;
                if (yolculukTipi==2)
                {
                    BiletIndirimi= indirimliTutar*0.20;
                    ToplamTutar=(indirimliTutar-BiletIndirimi)*2;
                    System.out.print(ToplamTutar);
                }
                else  System.out.print(indirimliTutar);
            }

            else if ((yas > 12) && (yas < 24)) {
                NormalTutar = mesafeBasi * kM;
                YasindirimliTutar= 0.10 * NormalTutar;
                indirimliTutar= NormalTutar - YasindirimliTutar;
                if (yolculukTipi==2)
                {
                    BiletIndirimi= indirimliTutar*0.20;
                    ToplamTutar=(indirimliTutar-BiletIndirimi)*2;
                    System.out.print(ToplamTutar);
                }
                else  System.out.print(indirimliTutar);
            }


            else {
                NormalTutar = mesafeBasi * kM;
                YasindirimliTutar= 0.30 * NormalTutar;
                indirimliTutar= NormalTutar- YasindirimliTutar;
                if (yolculukTipi==2)
                {
                    BiletIndirimi= indirimliTutar*0.20;
                    ToplamTutar=(indirimliTutar-BiletIndirimi)*2;
                    System.out.print(ToplamTutar);
                }
                else  System.out.print(indirimliTutar);
            }
        }
    }
}/*
    Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
    Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
    İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
    Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
    Toplam Tutar = (135-27)* 2 = 216 TL

    Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        Toplam Tutar = (135-27)* 2 = 216 TL*/