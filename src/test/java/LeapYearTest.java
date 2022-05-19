import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYearTest() {
        assertTrue(LeapYear.isLeapYear(Constants.FOUR));

        assertTrue(LeapYear.isLeapYear(Constants.FOUR_HUNDRED));

        assertFalse(LeapYear.isLeapYear(Constants.ONE));

        assertFalse(LeapYear.isLeapYear(Constants.HUNDRED));
    }
}