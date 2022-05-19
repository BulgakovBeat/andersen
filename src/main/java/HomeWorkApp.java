import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        PrinterMethods.printNumberOfTask(Constants.FIRST);
        PrinterMethods.printResultOfTask(LimitSum.checkSum(Constants.SIX, Constants.HUNDRED));

        PrinterMethods.printNumberOfTask(Constants.SECOND);
        PrinterMethods.printResultOfTask(SignNumber.checkSignOfNumber(Constants.SIX));

        PrinterMethods.printNumberOfTask(Constants.THIRD);
        PrinterMethods.printResultOfTask(SignNumber.isNegativeNumber(Constants.SIX));

        PrinterMethods.printNumberOfTask(Constants.FOURTH);
        PrinterMethods.printMultipleString(Constants.STRING_EXAMPLE, Constants.FOUR);
        PrinterMethods.printSpace();

        PrinterMethods.printNumberOfTask(Constants.FOURTH_WITH_STAR);
        PrinterMethods.printResultOfTask(LeapYear.isLeapYear(Constants.FOUR_HUNDRED));

        PrinterMethods.printNumberOfTask(Constants.FIFTH);
        PrinterMethods.printMas(ArrayNumberSwapper.swapNumbers(Constants.ARRAY_EXAMPLE_ONE));

        PrinterMethods.printNumberOfTask(Constants.SIXTH);
        PrinterMethods.printMas(FillingOfArray.fillFromOneToHundred());

        PrinterMethods.printNumberOfTask(Constants.SEVENTH);
        PrinterMethods.printMas(ArrayWalker.walkInTheArray());

        PrinterMethods.printNumberOfTask(Constants.EIGHTH);
        PrinterMethods.matrixPrinter(FillingOfMatrix.fillMatrix(Constants.FOUR));

        PrinterMethods.printNumberOfTask(Constants.NINTH);
        PrinterMethods.printMas(FillingOfArray.fillWithInitialValue(Constants.TEN, Constants.TWO));

        PrinterMethods.printNumberOfTask(Constants.NINTH_WITH_STAR);
        PrinterMethods.printMas(FillingOfArray.shiftArray(Constants.ARRAY_EXAMPLE_TWO, Constants.FOUR));
    }
}