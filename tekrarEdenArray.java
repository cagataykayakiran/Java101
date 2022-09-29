import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] list = {1,2,2,4,4,5,66,6,7,8,8,6,66,7 };
        int[] list2 = new int[list.length];
        int startindex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (isFind(list2,list[i])) {
                        list2[startindex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(list2));
    }
}
