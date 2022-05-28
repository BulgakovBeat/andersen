public abstract class Animal {
    private static int countOfAnimals = 0;

    Animal() {
        countOfAnimals++;
    }

    void run(int distance) {
        System.out.println("The Animal was running");
    }

    void swim(int distance) {
        System.out.println("The Animal was swimming");
    }
}
