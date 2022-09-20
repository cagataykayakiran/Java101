import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, basamaksayisi = 0, basamakdegeri, total = 0;
        System.out.print("Sayi giriniz:");
        x = input.nextInt();

        int tempNumber = x;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basamaksayisi++;
        }

        tempNumber = x;
        while (tempNumber != 0) {
            basamakdegeri = tempNumber % 10;
            int pow = 1;
            for (int i = 0; i < basamaksayisi; i++) {
                pow *= basamakdegeri;
            }
            total += pow;
            tempNumber /= 10;
        }

        if (total == x) {
            System.out.println(x + "sayisi bir Armstrong sayidir");
        }else {
            System.out.println(x + "sayisi bir Armstrong sayi değildir");
        }
    }
}
