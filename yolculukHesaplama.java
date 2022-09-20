timport java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int km,age,type;
        double tutar, yasindirim, indirimtutar, typeindirim, total;
        Scanner input = new Scanner(System.in);
        System.out.print("KM cinsinden mesafe giriniz:");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        age = input.nextInt();
        System.out.println("""
                1-Tek Yön
                2-Gidiş Dönüş""");
        System.out.print("Yolculuk tipini seçiniz:");
        type = input.nextInt();
        if (km < 1 || age < 1) {
            System.out.println("hatalı veri");
        }
        else if (type == 1) {
            if (age < 12) {
                tutar = km * 0.10;
                yasindirim = tutar * 0.50;
                indirimtutar = tutar - yasindirim;
                total = indirimtutar;
                System.out.println(total);
            }
            if (12 < age && age < 24) {
                tutar = km * 0.10;
                yasindirim = tutar * 0.10;
                indirimtutar = tutar - yasindirim;
                total = indirimtutar;
                System.out.println(total);
            }
            if (age > 65) {
                tutar = km * 0.10;
                yasindirim = tutar * 0.30;
                indirimtutar = tutar - yasindirim;
                total = indirimtutar;
                System.out.println(total);
            }
        }
        else if (type == 2) {
            if (age < 12) {
                tutar = km * 0.10;
                yasindirim = tutar * 0.50;
                indirimtutar = tutar - yasindirim;
                typeindirim = indirimtutar * 0.20;
                total = (indirimtutar - typeindirim) * 2;
                System.out.println(total);
            }
            if (12 < age && age < 24) {
                tutar = km * 0.10;
                yasindirim = tutar * 0.10;
                indirimtutar = tutar - yasindirim;
                typeindirim = indirimtutar * 0.20;
                total = (indirimtutar - typeindirim) * 2;
                System.out.println(total);
            }
            if (age > 65) {
                tutar = km * 0.10;
                yasindirim = tutar * 0.30;
                indirimtutar = tutar - yasindirim;
                typeindirim = indirimtutar * 0.20;
                total = (indirimtutar - typeindirim) * 2;
                System.out.println(total);
            }
        }

    }
}
