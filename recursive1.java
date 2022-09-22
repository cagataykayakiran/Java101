import java.util.Scanner;

public class Test {
    static int pow(int a,int b){
        if (a == 1 || b == 0)
            return 1;
        return a * pow(a,b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayiyi girin:");
        int a = input.nextInt();
        System.out.print("Üst sayiyi girin:");
        int b = input.nextInt();

        System.out.println("Sonucunuz: " + pow(a,b));
    }
}
