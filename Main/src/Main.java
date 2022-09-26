import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int salary;
        int workHour;
        int hireYear;


        System.out.print("Adınızı giriniz: ");
        name = input.nextLine();
        System.out.print("Maaşınızı giriniz: ");
        salary = input.nextInt();
        System.out.print("Haftalık çalışma saatinizi giriniz: ");
        workHour = input.nextInt();
        System.out.print("Başlangıç yılınızı giriniz: ");
        hireYear = input.nextInt();

        if (salary < 0) {
            System.out.println("Hatalı giriş yaptınız...");
            return;
        }

        Employee e1 = new Employee(name,salary,workHour,hireYear);
        e1.showInfo();
    }
}