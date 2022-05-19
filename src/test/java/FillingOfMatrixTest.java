import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillingOfMatrixTest {

    @Test
    void fillMatrixTest() {
        int[][] matrixTest = Constants.MATRIX_FILL_TEST;
        assertArrayEquals(matrixTest, FillingOfMatrix.fillMatrix(Constants.FOUR));
    }
}