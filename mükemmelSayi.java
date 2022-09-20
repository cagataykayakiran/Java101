import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("sayi giriniz:");
        n = input.nextInt();
        int carpan = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                carpan += i;
            }
        }
        if (carpan == n) {
            System.out.println(n + " " + "Mükemmel bir sayıdır.");
        }
        else {
            System.out.println(n + " " + "Mükemmel bir sayı değildir.");
        }
    }
}
