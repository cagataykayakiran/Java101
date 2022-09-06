import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        int matematik = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        int tarih = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Muzik notunu giriniz: ");
        int muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + tarih + turkce + muzik);
        double ortalama = toplam / 6;
        System.out.println("Not ortalaması: " + ortalama);
        String sonuc = (ortalama > 60) ? "Sınıfı gecti" : "Sınıfta kaldi";
        System.out.println(sonuc);

    }
}
