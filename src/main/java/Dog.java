import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal {
    private static int countOfDogs = 0;
    private static final int LIMIT_OF_RUNNING_FOR_DOGS = 500;
    private static final int LIMIT_OF_SWIMMING_FOR_DOGS = 10;

    public Dog() {
        super();
        countOfDogs++;
    }

    @Override
    void run(int distance) {
        if (distance <= LIMIT_OF_RUNNING_FOR_DOGS)
            System.out.println("Dog ran " + distance + " meters");
        else
            System.out.println("So big distance for running Dog");
    }

    @Override
    void swim(int distance) {
        if (distance <= LIMIT_OF_SWIMMING_FOR_DOGS)
            System.out.println("Dog swim " + distance + " meters");
        else
            System.out.println("So big distance for swimming Dog");
    }
}
