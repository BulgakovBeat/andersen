public class LeapYear {
    public static boolean isLeapYear(int year) {
        return year % Constants.FOUR_HUNDRED == Constants.ZERO ||
                (year % Constants.FOUR == Constants.ZERO && year % Constants.HUNDRED != Constants.ZERO);
    }
}
