import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       int n1,n2,n3;
       Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        n3 = input.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            if (n2 > n3) {
                System.out.println("n1 > n2 > n3");
            }
            else {
                System.out.println("n1 > n3 > n2");
            }
        }
        if ((n2 > n1) && (n2 > n3)) {
            if (n1 > n3) {
                System.out.println("n2 > n1 > n3");
            }
            else {
                System.out.println("n2 > n3 > n1");
            }
        }
        if ((n3 > n2) && (n3 > n3)) {
            if (n2 > n1) {
                System.out.println("n3 > n2 > n1");
            }
            else {
                System.out.println("n3 > n1 > n2");
            }
        }
    }
}
