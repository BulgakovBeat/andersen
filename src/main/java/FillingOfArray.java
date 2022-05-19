import java.util.Arrays;

public class FillingOfArray {
    public static int[] fillFromOneToHundred() {
        int[] mas = new int[Constants.HUNDRED];
        for (int i = 1; i <= mas.length; i++) {
            mas[i - 1] = i;
        }

        return mas;
    }

    public static int[] fillWithInitialValue(int len, int initialValue) {
        int[] mas = new int[len];
        Arrays.fill(mas, initialValue);

        return mas;
    }

    public static int[] shiftArray(int[] array, int n) {
        int[] mas = Arrays.copyOf(array, array.length);
        int len = mas.length;
        int shift = (n % len + len) % len;

        for (int i = len - 1; i > len - gcd(shift, len) - 1; i--) {
            int temp = mas[i];
            int j = i;
            int k = (j - shift + len) % len;
            while (k != i) {
                mas[j] = mas[k];
                j = k;
                k = (j - shift + len) % len;
            }
            mas[j] = temp;
        }

        return mas;
    }

    private static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}