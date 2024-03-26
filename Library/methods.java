import java.util.Scanner;
import java.util.List;

public class methods {
    
    public static void Menu() {
        System.out.println("1- Veri girisi.......7- Cikis");
    }

    public static void VeriGiris(Scanner scan, List<String> kAdi, List<String> yazarAdi, List<String> yayinEviAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {

        System.out.println("Kitap adi giriniz : ");
        kAdi.add(scan.next());
        System.out.println("Yazar adi giriniz : ");
        yazarAdi.add(scan.next());
        System.out.println("Yayin evi adi giriniz : ");
        yayinEviAdi.add(scan.next());
        System.out.println("Sayfa sayisini giriniz : ");
        sayfaSayisi.add(scan.nextInt());
        System.out.println("Kitap ucretini giriniz : ");
        fiyat.add(scan.nextInt());
        System.out.println(kAdi.getLast() + " eklendi. ");
        
    }

    public static void Listele(Scanner scan, List<String> kAdi, List<String> yazarAdi, List<String> yayinEviAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {
        for (int i = 0; i < kAdi.size(); i++) {
            cikti(i, kAdi.get(i), yayinEviAdi.get(i), yazarAdi.get(i), sayfaSayisi.get(i), fiyat.get(i));
        }
    }

    private static void cikti(int i, String kAdi, String yazarAdi, String yayinEviAdi, Integer sayfaSayisi, Integer tekFiyat) {
        System.out.println("Sirasi : " + i );
        System.out.println("Kitap adi : " + kAdi);
        System.out.println("Yazar adi : " + yazarAdi);
        System.out.println("Yayinevi adi : " + yayinEviAdi);
        System.out.println("Ssyfa sayisi : " + sayfaSayisi);
        System.out.println("Fiyati : " + tekFiyat);
        System.out.println("----------------");
    }

    public static void adArama(String arananAd, List<String> kAdi, List<String> yazarAdi, List<String> yayinEviAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {
    
        for (int i = 0; i < kAdi.size(); i++) {
            if (kAdi.get(i).equalsIgnoreCase(arananAd)) {
                cikti(i, kAdi.get(i), yayinEviAdi.get(i), yazarAdi.get(i), sayfaSayisi.get(i), fiyat.get(i));

            }
        }
    }

    static int Toplam(List<Integer> sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);
        }
        return toplam;

    }

    public static void AdSilme(Scanner scan, String silinenAd, List<String> kAdi, List<String> yayinEviAdi, List<String> yazarAdi,
    List<Integer> sayfaSayisi, List<Integer> fiyat) {
        adArama(silinenAd, kAdi, yazarAdi, yayinEviAdi, sayfaSayisi, fiyat);
        System.out.println("Hangi siradaki kitap silinecek : ");
        int index = scan.nextInt();
        String silinen = kAdi.remove(index);
        yazarAdi.remove(index);
        yayinEviAdi.remove(index);
        sayfaSayisi.remove(index);
        fiyat.remove(index);
        System.out.println(silinen + " Kitabi silindi");

    }

    public static void Adduzeltme(Scanner scan, String duzeltilenAd,  List<String> kAdi, List<String> yazarAdi, List<String> yayinEviAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {
        adArama(duzeltilenAd, kAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
        System.out.println("Hangi siradaki kitap duzenlenecek : ");
        int index = scan.nextInt();
        System.out.println("Yeni kitap adini giriniz : ");
        String kitapAdi = scan.next();
        if(!kitapAdi.isEmpty()) kAdi.set(index, kitapAdi);
        System.out.println("Yeni yazar adini giriniz : ");
        String yAdi = scan.next();
        if(!yAdi.isEmpty()) yazarAdi.set(index, yAdi);
        System.out.println("Yeni yayin evi adini giriniz : ");
        String yYayinEvi = scan.next();
        if(!yYayinEvi.isEmpty()) yayinEviAdi.set(index, yYayinEvi);
        System.out.println("Yeni sayfa sayisini giriniz : ");
        String ysSayisi = scan.next();
        if(ysSayisi.isEmpty()) sayfaSayisi.set(index, Integer.parseInt(ysSayisi));
        System.out.println("Yeni fiyati giriniz : ");
        String sFiyat = scan.next();
        if(!sFiyat.isEmpty()) fiyat.set(index, Integer.parseInt(sFiyat));

        



    }

}
