public class SignNumber {
    public static String checkSignOfNumber(int number) {
        return (number >= Constants.ZERO) ? Constants.POSITIVE : Constants.NEGATIVE;
    }

    public static boolean isNegativeNumber(int number) {
        return number < Constants.ZERO;
    }
}