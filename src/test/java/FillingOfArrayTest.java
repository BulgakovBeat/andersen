import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FillingOfArrayTest {

    @Test
    void fillFromOneToHundredTest() {
        int[] masTest = new int[Constants.HUNDRED];
        for (int i = Constants.ONE; i <= Constants.HUNDRED; i++)
            masTest[i - 1] = i;

        assertArrayEquals(masTest, FillingOfArray.fillFromOneToHundred());
    }

    @Test
    void fillWithInitialValueTest() {
        int len = Constants.FOUR;
        int number = Constants.TEN;
        int[] masTest = new int[len];
        Arrays.fill(masTest, number);

        assertArrayEquals(masTest, FillingOfArray.fillWithInitialValue(len, number));
    }

    @Test
    void shiftArrayTest() {
        int[] masTest = Constants.ARRAY_SHIFT_TEST;

        assertArrayEquals(masTest, FillingOfArray.shiftArray(Constants.ARRAY_EXAMPLE_TWO, Constants.FOUR));
    }
}