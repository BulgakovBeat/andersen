import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignNumberTest {

    @Test
    void checkSignOfNumberTest() {
        assertEquals(Constants.NEGATIVE, SignNumber.checkSignOfNumber(Constants.NEGATIVE_NUMBER));
        assertEquals(Constants.POSITIVE, SignNumber.checkSignOfNumber(Constants.SIX));
    }

    @Test
    void isNegativeNumberTest() {
        assertTrue(SignNumber.isNegativeNumber(Constants.NEGATIVE_NUMBER));
        assertFalse(SignNumber.isNegativeNumber(Constants.FOUR));
    }
}