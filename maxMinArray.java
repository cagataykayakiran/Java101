import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();

        Arrays.sort(list);
        int min = list[0], max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > number) {
                System.out.println("Girilen sayıdan en küçük sayı: " + list[i-1]);
                break;
            }
        }

        for (int j = 0; j < list.length; j++){
            if (list[j] > number) {
                System.out.println("Girilen sayıdan en büyük sayı: " + list[j]);
                break;
            }

        }
    }
}
