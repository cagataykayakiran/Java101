import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x, y, total=1;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        x = input.nextInt();
        System.out.print("üst ifade giriniz:");
        y = input.nextInt();

        for (int i = 1; i<=y; i++) {
            total *= x;
        }
        System.out.println(total);
    }
}
