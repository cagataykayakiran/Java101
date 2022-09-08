import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5,derssayisi = 0;
        double ortalama = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        n1 = input.nextInt();
        if ((n1>0) && (n1<100)){
            ortalama += n1;
            derssayisi++;
        }
        else {
            System.out.println("Değer geçersiz...");
        }
        System.out.print("Fizik notunuzu giriniz:");
        n2 = input.nextInt();
        if ((n2>0) && (n2<100)){
            ortalama += n2;
            derssayisi++;
        }
        else {
            System.out.println("Değer geçersiz...");
        }
        System.out.print("Türkçe notunuzu giriniz:");
        n3 = input.nextInt();
        if ((n3>0) && (n3<100)){
            ortalama += n3;
            derssayisi++;
        }
        else {
            System.out.println("Değer geçersiz...");
        }
        System.out.print("Kimya notunuzu giriniz:");
        n4 = input.nextInt();
        if ((n4>0) && (n4<100)){
            ortalama += n4;
            derssayisi++;
        }
        else {
            System.out.println("Değer geçersiz...");
        }
        System.out.print("Müzik notunuzu giriniz:");
        n5 = input.nextInt();
        if ((n5>0) && (n5<100)){
            ortalama += n5;
            derssayisi++;
        }
        else {
            System.out.println("Değer geçersiz...");
        }

        double average = ortalama / derssayisi;

        if (average >= 55) {
            System.out.println("Sınıfı geçtiniz...");
        }
        else {
            System.out.println("Kaldınız...");
        }
    }
}
