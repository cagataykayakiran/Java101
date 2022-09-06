import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        int r = input.nextInt();

        System.out.print("Merkez açının ölçüsü: ");
        int a = input.nextInt();

        double alan = (pi * (r*r) * a) / 360;

        System.out.println("Alan: " + alan);

    }
}
