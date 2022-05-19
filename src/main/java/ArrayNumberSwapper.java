import java.util.Arrays;

public class ArrayNumberSwapper {
    public static int[] swapNumbers(int[] array) {
        int[] mas = Arrays.copyOf(array, array.length);

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == Constants.ZERO)
                mas[i] = Constants.ONE;
            else
                mas[i] = Constants.ZERO;
        }

        return mas;
    }
}