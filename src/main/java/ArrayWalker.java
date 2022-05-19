import java.util.Arrays;

public class ArrayWalker {
    public static int[] walkInTheArray() {
        int[] mas = Arrays.copyOf(Constants.ARRAY_EXAMPLE_TWO, Constants.ARRAY_EXAMPLE_TWO.length);

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < Constants.SIX)
                mas[i] *= Constants.TWO;
        }

        return mas;
    }
}
