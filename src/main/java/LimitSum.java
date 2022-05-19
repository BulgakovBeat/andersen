public class LimitSum {
    public static boolean checkSum(int firstNumber, int secondNumber) {
        int sumOfNumbers = firstNumber + secondNumber;

        return sumOfNumbers <= Constants.TWENTY && sumOfNumbers >= Constants.TEN;
    }
}