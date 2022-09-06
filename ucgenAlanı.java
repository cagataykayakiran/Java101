import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        int kenar1 = input.nextInt();

        System.out.print("İkinci kenarı giriniz: ");
        int kenar2 = input.nextInt();

        System.out.print("Üçüncü kenarı giriniz: ");
        int kenar3 = input.nextInt();

        int u = (kenar1 + kenar2 + kenar3)/2;

        double alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));

        System.out.println(alan);

    }
}
