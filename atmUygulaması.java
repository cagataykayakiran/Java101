import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int counter = 3;
        int select;
        int bakiye = 3000;

        while (counter > 0) {
            System.out.print("Enter the username:");
            username = input.nextLine();
            System.out.print("Enter the password:");
            password = input.nextLine();

            if (username.equals("cagatay") && password.equals("123")) {
                System.out.println("Giriş yapıldı");
                System.out.println("Hoşgeldiniz...");
                do {
                    System.out.println("""
                            1-Para Çekme
                            2-Para Yatırma
                            3-Bakiye Sorgulama
                            4-Çıkış""");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.println("Bakiyeniz: " + bakiye);
                            int cekim;
                            System.out.println("Ne kadar çekmek istersiniz:");
                            cekim = input.nextInt();
                            if (cekim > bakiye) {
                                System.out.println("Bakiyeniz yetersiz...");
                            }else {
                                bakiye -= cekim;
                                System.out.println("Yeni bakiyeniz:" + bakiye);
                            }
                            }
                        case 2 -> {
                            System.out.println("Bakiyeniz: " + bakiye);
                            int yatirim;
                            System.out.print("Ne kadar yatırmak istersiniz:");
                            yatirim = input.nextInt();
                            bakiye += yatirim;
                            System.out.println("Yeni bakiyeniz:" + bakiye);
                        }
                        case 3 -> System.out.println("Bakiyeniz: " + bakiye);
                        case 4 -> System.out.println("Çıkış yapılıyor...");
                        default -> System.out.println("Yanlış tuşa bastınız...");
                    }
                }while (select != 4);
                            break;
            }else {
                counter--;
                System.out.println("Yanlış giriş yapıldı");
                if (counter == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                }
                else {
                    System.out.println("Kalan hakkınız: " + counter);
                }

            }
        }
    }
}
