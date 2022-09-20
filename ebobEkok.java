import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        n2 = input.nextInt();
        int ebob=1;
        int ekok;
        int i = 1;
        while (i <= n1){
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = ((n1 * n2)/ebob);

        System.out.println("sayiların ebobu: " + ebob);
        System.out.println("sayiların ekoku: " + ekok);
    }
}
