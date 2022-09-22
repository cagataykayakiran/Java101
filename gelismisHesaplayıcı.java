import java.util.Scanner;

public class Test {
    static void toplama(int a,int b){
        int result = a + b;
        System.out.println("Sonuç: " + result);
    }
    static void cikarma(int a,int b){
        int result = a - b;
        System.out.println("Sonuç: " + result);
    }
    static void carpma(int a,int b){
        int result = a * b;
        System.out.println("Sonuç: " + result);
    }
    static void bolme(int a,int b){
        int result = a / b;
        System.out.println("Sonuç: " + result);
    }
    static void pow(int a,int b){
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç: " + result);
    }
    static void fak(){
        Scanner input = new Scanner(System.in);
        System.out.println("faktöriyel sayısını girin:");
        int a = input.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }
    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();
        int a = number % 10;
        System.out.print("Sonuç: " + a);
    }
    static void hesap(int a,int b) {
        int alan = a * b;
        System.out.println("Dikdörtgenin alanı: " + alan);
        int cevre = (a + b) * 2;
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hesap Makinesine Hoşgeldiniz...");
        String menu = ("""
                1-Toplama
                2-Çıkarma
                3-Çarpma
                4-Bölme
                5-Üslü Sayı Hesaplama
                6-Faktöriyel Hesaplama
                7-Mod Alma
                8-Dikdörtgen alanı ve çevre hesabı
                9-Çıkış""");
        int select;
        do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = input.nextInt();
            if (select == 9) {
                System.out.println("Çıkış Yaptınız...");
                System.out.println("İyi Günler...");
                break;
            }
            if (select == 6) {
                fak();
                continue;
            }
            if (select == 7) {
                mod();
                System.out.println(" ");
                continue;
            }
            System.out.println("Birinci sayiyi giriniz:");
            int a = input.nextInt();
            System.out.println("İkinci sayiyi giriniz:");
            int b = input.nextInt();
            switch (select) {
                case 1 -> toplama(a, b);
                case 2 -> cikarma(a, b);
                case 3 -> carpma(a, b);
                case 4 -> bolme(a, b);
                case 5 -> pow(a, b);
                case 8 -> hesap(a, b);

            }
            System.out.println("*******************");
        } while (select != 0);

    }
}
