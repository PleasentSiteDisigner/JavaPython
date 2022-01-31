public class Task3 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] c = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            System.out.println("");
            for (int j = 0; j <= 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
        }

    }
}
