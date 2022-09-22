import java.util.Scanner;

public class Test {
    static int fib(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fib(x-1) + fib(x-2);
    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int number = input.nextInt();
        for (int i = 1; i < number; i++) {

            System.out.print(fib(i) + " ");
        }


    }
}
