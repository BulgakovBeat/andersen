import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }

        return false;
    }

    public void addingFood(int amount) {
        food += amount;
    }
}
