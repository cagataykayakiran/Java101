import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        username = input.nextLine();
        System.out.print("Şifre giriniz: ");
        password = input.nextLine();

        if ((username.equals("java")) && (password.equals("java123"))) {
            System.out.println("Başarıyla giriş yapıldı...");
        }
        else if ((!username.equals("java")) && (password.equals("java123"))) {
            System.out.println("Kullanıcı adı hatalı...");
        }
        else if ((username.equals("java")) && (!password.equals("java123"))) {
            System.out.println("Şifreyi yanlış girdiniz...");
            System.out.println("Şifre değiştirmek ister misiniz ? \nEvet \nHayır");
            String answer = input.nextLine();
            if (answer.equals("Evet") || (answer.equals("evet"))) {
                System.out.println("Yeni şifre girin...");
                String newpassword = input.nextLine();
                if (newpassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                    newpassword = password;
                }
            }
        else {
                System.out.println("tekrar deneyin...");
            }
        }
    }
}

