import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int number = input.nextInt();
        int[] numberArray = new int[number];

        for (int i = 0; i< numberArray.length; i++) {
            System.out.print(i+1 + " . Sayıyı giriniz : ");
            numberArray[i] = input.nextInt();
        }

         int max = Arrays.stream(numberArray).max().getAsInt();
         int min = Arrays.stream(numberArray).min().getAsInt();

        System.out.println("Dizide ki en büyük değer: " + max);
        System.out.println("Dizide ki en küçük değer: " + min);

    }
}
