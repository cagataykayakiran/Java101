import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x,basamakdegeri, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        x = input.nextInt();

        while (x != 0){
            basamakdegeri = x % 10;
            toplam += basamakdegeri;
            x /= 10;
        }
        System.out.println(toplam);
    }
}
