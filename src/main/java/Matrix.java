import Exceptions.MyArrayDataException;

import java.util.Random;

public class Matrix {
    int n;
    int m;
    String[][] matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        fillMatrix();
    }

    public void fillMatrix() {
        Random rand = new Random();
        matrix = new String[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = String.valueOf(rand.nextInt(Constants.HUNDRED));
    }

    public void destroyMatrix() {
        Random rand = new Random();
        int n = rand.nextInt(this.n);
        int m = rand.nextInt(this.m);
        matrix[n][m] = "x";
    }

    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public boolean checkSize() {
        return n == Constants.FOUR && m == Constants.FOUR;
    }

    public void sumMatrix() throws MyArrayDataException {
        int sum = Constants.ZERO;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (!isNumeric(matrix[i][j]))
                    throw new MyArrayDataException(i, j, matrix[i][j]);
                sum += Integer.parseInt(matrix[i][j]);
            }

        System.out.println("Final sum = " + sum);
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "n=" + n +
                ", m=" + m +
                '}';
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }
}
