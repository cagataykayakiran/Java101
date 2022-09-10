import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n, total = 0;
        boolean isNumber = true;
        Scanner input = new Scanner(System.in);

        while (isNumber) {
            System.out.print("sayi giriniz:");
            n = input.nextInt();
            if (n % 2 == 0) {
                if (n % 4 == 0) {
                    total += n;
                }
            }else {
                System.out.println("toplam sayınız: " + total);
                isNumber = false;
            }
        }
    }
}
