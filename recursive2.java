import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int number = input.nextInt();

        asal(number,2);
    }

    static int asal(int a, int b){
        if (a == b) {
            System.out.println("asal sayidir...");
            return a;
        }
        else if (a % b == 0) {
            System.out.println("asal değildir");
            return a;
        }
        else if (a == 1){
            System.out.println("asal değildir.");
            return 1;
        }

        return asal(a,b+1);
    }

}
