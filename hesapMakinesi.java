import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi1 giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("sayi2 giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println("Hangi işlemi istersiniz: \n:1-toplama\n:2-cikarma\n:3-carpma\n:4-bolme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonucunuz: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonucunuz:" + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonucunuz:" + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi1 == 0 || sayi2 == 0) {
                    System.out.println("sıfıra bölünemez...");
                }
                else {
                    System.out.println("Sonucunuz:" + (sayi1 / sayi2));
                }
                    break;
                    default:
                        System.out.println("hatalı işlem...");
                        break;

            }
        }
    }
