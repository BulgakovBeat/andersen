import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private final Class<T> type;
    private List<T> obj;

    public Box(List<T> obj, Class<T> typeOfFruit) {
        this.obj = obj;
        this.type = typeOfFruit;
    }

    public double getWeight() {
        if (obj.size() != 0) {
            return obj.size() * Fruit.getPrice(type);
        }

        return 0;
    }

    public boolean compareBoxes(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public Class<T> getType() {
        return type;
    }

    public void addFruit(Object fruit) {
        if (type.equals(fruit.getClass())) {
            if (obj.size() == 0)
                obj = new ArrayList<>();

            obj.add((T) fruit);
        } else
            System.out.println("Different types of Fruits");
    }

    public List<T> getList() {
        return obj;
    }

    public void sprinkleFruits(Box<T> box) {
        if (box.getType().equals(this.getType())) {
            List<T> list = box.getList();
            for (T t : list)
                addFruit(t);

            box.getList().clear();
        } else {
            System.out.println("Different types of fruits");
        }
    }
}
