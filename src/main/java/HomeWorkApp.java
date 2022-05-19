import java.util.Random;

public class HomeWorkApp {
    private static final Random random = new Random();

    private static void checkSumSign() {
        int firstNumber = random.nextInt(Constants.RANDOM_NUMBER) - Constants.NUMBER_TO_DISTRIBUTE;
        int secondNumber = random.nextInt(Constants.RANDOM_NUMBER) - Constants.NUMBER_TO_DISTRIBUTE;
        int sumOfNumbers = firstNumber + secondNumber;
        if (sumOfNumbers >= 0) {
            System.out.println(Constants.POSITIVE_NUMBER);
        } else {
            System.out.println(Constants.NEGATIVE_NUMBER);
        }

        System.out.println();
    }

    private static void printColor() {
        int value = random.nextInt(2 * Constants.RANDOM_NUMBER) - Constants.NUMBER_TO_DISTRIBUTE;
        if (value <= 0) {
            System.out.println(Constants.RED_COLOR);
        }

        if (100 >= value && value >= 0) {
            System.out.println(Constants.YELLOW_COLOR);
        }

        if (value >= 100) {
            System.out.println(Constants.GREEN_COLOR);
        }

        System.out.println();
    }

    private static void printThreeWords() {
        System.out.println(Constants.ORANGE);
        System.out.println(Constants.BANANA);
        System.out.println(Constants.APPLE);

        System.out.println();
    }

    private static void compareNumbers() {
        int a = random.nextInt(Constants.RANDOM_NUMBER) - Constants.NUMBER_TO_DISTRIBUTE;
        int b = random.nextInt(Constants.RANDOM_NUMBER) - Constants.NUMBER_TO_DISTRIBUTE;
        if (a >= b)
            System.out.println(Constants.A_MORE_THAN_B);
        else
            System.out.println(Constants.A_LESS_THAN_B);

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(Constants.FIRST + Constants.METHOD);
        printThreeWords();
        System.out.println(Constants.SECOND + Constants.METHOD);
        checkSumSign();
        System.out.println(Constants.THIRD + Constants.METHOD);
        printColor();
        System.out.println(Constants.FOURTH + Constants.METHOD);
        compareNumbers();
    }
}