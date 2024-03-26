import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class library {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> kAdi = new ArrayList<String>();
        List<String> yazarAdi = new ArrayList<String>();
        List<String> yayinEviAdi = new ArrayList<String>();
        List<Integer> sayfaSayisi = new ArrayList<Integer>();
        List<Integer> fiyat = new ArrayList<Integer>();
        byte menu;
        for (;;) {
            methods.Menu();
            menu = scan.nextByte();
            switch (menu) {

                case 1:
                    methods.VeriGiris(scan, kAdi, yazarAdi, yayinEviAdi, sayfaSayisi, fiyat);
                    break;
                case 2:
                    methods.Listele(scan, kAdi, yazarAdi, yayinEviAdi, sayfaSayisi, fiyat);
                    break;
                case 3:
                    System.out.println("Aranacak ismi giriniz : ");
                    String arananAd = scan.next();
                    methods.adArama(arananAd, kAdi, yazarAdi, yayinEviAdi, sayfaSayisi, fiyat);
                    break;
                case 4:

                    System.out.println("Sayfa sayisi ortalamasi : " + (methods.Toplam(sayfaSayisi) / sayfaSayisi.size()));
                    System.out.println("Fiyat ortalamasi : " + (methods.Toplam(fiyat) / fiyat.size()));
                    break;
                case 5:
                    System.out.println("Silinecek ismi giriniz : ");
                    String silinenAd = scan.next();
                    methods.AdSilme(scan, silinenAd, kAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);

                    break;
                case 6:
                    System.out.println("Duzeltilecek ismi giriniz : ");
                    String duzeltilenAd = scan.next();
                    methods.Adduzeltme(scan, duzeltilenAd, kAdi, yazarAdi, yayinEviAdi, sayfaSayisi, fiyat);
                    break;
                case 7:
                    System.out.println("Program bitti");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Yanlis menu degeri Girdiniz");
            }
        }

    }

}