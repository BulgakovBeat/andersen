import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNumberSwapperTest {

    @Test
    void swapNumbersTest() {
        int[] masTest = Constants.ARRAY_SWAP_TEST;
        assertArrayEquals(masTest, ArrayNumberSwapper.swapNumbers(Constants.ARRAY_EXAMPLE_ONE));
    }
}