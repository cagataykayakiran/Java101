import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n,r,totalN = 1,totalR=1;
        int totalfark = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        n = input.nextInt();
        System.out.print("r değerini giriniz:");
        r = input.nextInt();

        for (int i = 1; i<=n;i++) {
            totalN *= i;
        }
        for (int k = 1; k<=r; k++) {
            totalR *= k;
        }
        for (int j = 1; j <= (n-r); j++) {
            totalfark *= j;
        }

        int totalmax = totalN / (totalR * totalfark);
        System.out.println(totalmax);
    }

}
