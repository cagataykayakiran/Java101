import java.util.Scanner;

public class Test {
    static boolean isPolindrom(int x) {
        int tempNumber = x, reverseNumber = 0, lastNumber;

        while (tempNumber != 0) {

            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        if (x == reverseNumber) {
            System.out.println(x + "polindrom sayidir...");
            return true;
        }
        else
            System.out.println(x + " " + "polindrom değildir...");
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int number = input.nextInt();
        System.out.println(isPolindrom(number));
    }
}
