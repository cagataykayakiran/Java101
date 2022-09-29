import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + "." + "Elamanı giriniz: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
