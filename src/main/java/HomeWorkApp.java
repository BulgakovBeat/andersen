public class HomeWorkApp {

    public static void main(String[] args) {
        String[] header = new String[]{"Value1", "Value2", "Value3"};
        int[][] mas = new int[][]{{100, 101, 102}, {103, 104, 105}, {106, 107, 108}};
        AppData app = new AppData(header, mas);
        app.writeToFile();

        AppData app2 = new AppData();
        app2.readToFile();
        app2.print();
    }
}

