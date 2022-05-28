import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {
    private static int countOfCats = 0;
    private static final int LIMIT_OF_RUNNING_FOR_CATS = 200;
    private int appetite;
    private String name;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        super();
        countOfCats++;
        this.appetite = appetite;
        this.name = name;
    }

    @Override
    void run(int distance) {
        if (distance <= LIMIT_OF_RUNNING_FOR_CATS)
            System.out.println("Cat ran " + distance + " meters");
        else
            System.out.println("So big distance for running Cat");
    }

    @Override
    void swim(int distance) {
        System.out.println("Cats can't swim!");
    }

    public void eat(Plate p) {
        System.out.println("Amount on plate " + p.getFood());
        System.out.println("Amount of food for Cat " + countOfCats + " is " + appetite);
        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.println("The cat number " + countOfCats + " is satiety");
        } else
            System.out.println("The cat number " + countOfCats + " isn't satiety");

        System.out.println();
    }
}
