public class PrinterMethods {
    public static void printNumberOfTask(String str) {
        System.out.println(str + " " + Constants.METHOD);
    }

    public static void printSpace() {
        System.out.println();
    }

    public static <T> void printResultOfTask(T elem) {
        System.out.println(elem);
        printSpace();
    }

    public static void printMas(int[] mas) {
        for (int ma : mas)
            System.out.print(ma + " ");

        System.out.println();
        System.out.println();
    }
    public static void matrixPrinter(int[][] matrix) {
        int n = matrix.length;

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }

        System.out.println();
    }

    public static void printMultipleString(String str, int number) {
        System.out.println(str.repeat(number));
    }
}
