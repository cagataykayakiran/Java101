public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int zam;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax(){
        if (this.salary > 1000){
             tax = (this.salary * 3) / 100;
            System.out.println("Vergi: " + tax);
        }
        else {
            System.out.println("Vergi  = 0");

        }
    }

    void bonus(){
        if (this.workHours > 40){
             bonus = (this.workHours - 40) * 30;
            System.out.println("Bonus : " + bonus);
        }
        else {
            System.out.println("Bonusunuz yoktur.");
        }
    }

    void raiseSalary(){
        if ((2021 - this.hireYear) < 10 ){
             zam = (this.salary * 5) / 100;
            System.out.println("Maaş artışı: " + zam);
        }
        else if ((2021 - this.hireYear) > 19 ){
             zam = (this.salary * 15) / 100;
            System.out.println("Maaş artışı: " + zam);
        }
        else if ((2021 - this.hireYear) < 20 && (2021 - this.hireYear) > 9 ){
             zam = (this.salary * 10) / 100;
            System.out.println("Maaş artışı: " + zam);
        }
    }

    void showInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax + bonus));
        System.out.println("Toplam Maaş: " + ((this.salary + this.bonus + this.zam) - this.tax));
        System.out.println(this.salary);

    }
}
