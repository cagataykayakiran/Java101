import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut ? ");
        double a = input.nextDouble();
        System.out.print("Kaç kilo elma ? ");
        double e = input.nextDouble();
        System.out.print("Kaç kilo domates ? ");
        double d = input.nextDouble();
        System.out.print("Kaç kilo muz ? ");
        double m = input.nextDouble();
        System.out.print("Kaç kilo patlıcan ? ");
        double p = input.nextDouble();

        double tutar = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlican);
        System.out.println("Toplam Tutar: " + tutar);
    }
}
