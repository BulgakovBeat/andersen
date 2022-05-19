public class FillingOfMatrix {
    public static int[][] fillMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            matrix[i][i] = Constants.ONE;

        for (int i = n - 1; i >= 0; i--)
            matrix[n - 1 - i][i] = Constants.ONE;

        return matrix;
    }
}