import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        Plate plate = new Plate(Constants.MAX);
        Cat[] cats = new Cat[Constants.COUNT_OF_CATS];
        Random random = new Random();

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat number " + i, random.nextInt(Constants.DIFF + 1) + Constants.MIN);
            cats[i].eat(plate);
        }
    }
}

