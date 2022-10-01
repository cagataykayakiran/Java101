import java.util.Scanner;

public class Main {

    public static boolean check(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {

            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("Kelime yanlış ");
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
  
  //İkinci yol
    public static boolean chech2(String str){
        String reverse = "";
        for (int i = (str.length() - 1); i >=0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String string = input.nextLine();
        System.out.println(chech2(string));
    }
}
