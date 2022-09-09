import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        year = input.nextInt();
        int kalan = year % 12;

        switch (kalan) {
            case 0:
                System.out.println("Zodyağı Burcunuz :maymun");
                break;
            case 1:
                System.out.println("Zodyağı Burcunuz :horoz");
                break;
            case 2:
                System.out.println("Zodyağı Burcunuz :köpek");
                break;
            case 3:
                System.out.println("Zodyağı Burcunuz :domuz");
                break;
            case 4:
                System.out.println("Zodyağı Burcunuz :fare");
                break;
            case 5:
                System.out.println("Zodyağı Burcunuz :öküz");
                break;
            case 6:
                System.out.println("Zodyağı Burcunuz :Kaplan");
                break;
            case 7:
                System.out.println("Zodyağı Burcunuz :Tavşan");
                break;
            case 8:
                System.out.println("Zodyağı Burcunuz :ejderha");
                break;
            case 9:
                System.out.println("Zodyağı Burcunuz :yılan");
                break;
            case 10:
                System.out.println("Zodyağı Burcunuz :at");
                break;
            case 11:
                System.out.println("Zodyağı Burcunuz :koyun");
                break;
        }
    }
}
