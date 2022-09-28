public class Main {
    public static void main(String[] args) {

        double[] list = {1,2};
        double sum = 0;
        for (double i : list){
            sum += 1/i;
        }
        System.out.println(list.length / sum);
    }
}
