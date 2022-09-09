import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n, toplam = 0, c=0;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                c++;
            }
        }
        System.out.println("ortalama değer " + toplam/c);
    }
}
