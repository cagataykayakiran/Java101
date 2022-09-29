public class Main {
    public static void main(String[] args) {
        String [][] matrix = new String[7][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == 3 || i == 6){
                    matrix[i][j] = "*";
                    matrix[0][3] = " ";
                    matrix[3][3] = " ";
                    matrix[6][3] = " ";

                } else if (j == 0 || j == 3) {
                    matrix[i][j] = "*";
                }
                else {
                    matrix[i][j] = " ";
                }
            }

        }

        for (String[] row : matrix){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println(" ");
        }

    }
}
