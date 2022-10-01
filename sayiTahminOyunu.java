import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);

        int can = 5;
        int inputNumber;
        int i = 0;
        int[] tahminler = new int[can];
        boolean isWin = false;
        System.out.println(number);

        while (can > 0) {
            System.out.print("Sayi giriniz: ");
            inputNumber = input.nextInt();

            if (inputNumber < 0 || inputNumber > 100) {
                System.out.println("0-99 arasında bir sayi giriniz...");

            }
            else if (number == inputNumber) {
                System.out.println("Doğru tahmin ettiniz ! " + number);
                isWin = true;
                break;
            }
            else {
                System.out.println("Kalan canınını: " + --can);
                if (inputNumber > number) {
                    System.out.println("Daha düşük bir sayı giriniz...");
                }
                else {
                    System.out.println("Daha büyük bir sayı giriniz...");
                }
                tahminler[i++] = inputNumber;
            }

        }
        if (!isWin) {
            System.out.println("Sayıyı bulamadınız, Doğru sayı: " + number);
            System.out.println("Tahminleriniz: " + Arrays.toString(tahminler));
        }

    }
}
