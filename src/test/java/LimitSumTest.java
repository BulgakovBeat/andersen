import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitSumTest {

    @Test
    void checkSumTest() {
        assertTrue(LimitSum.checkSum(Constants.FOUR, Constants.TEN));

        assertFalse(LimitSum.checkSum(Constants.HUNDRED, Constants.TEN));
    }
}