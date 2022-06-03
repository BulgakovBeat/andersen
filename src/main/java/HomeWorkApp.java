import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {

        try {
            int n = Constants.FOUR;
            int m = getRandomNumberForMatrixSize();
            Matrix mat = new Matrix(n, m);

            if (!mat.checkSize())
                throw new MyArraySizeException(n, m);

            mat.sumMatrix();
            mat.printMatrix();

            //Adding this method to destroy the current matrix
            mat.destroyMatrix();
            mat.sumMatrix();
            mat.printMatrix();
        } catch (MyArraySizeException | MyArrayDataException ex) {
            ex.printStackTrace();
        }
    }

    public static int getRandomNumberForMatrixSize() {
        Random rand = new Random();
        return rand.nextInt(Constants.FOUR) + Constants.ONE;
    }
}

