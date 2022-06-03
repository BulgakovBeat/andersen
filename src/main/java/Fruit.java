public abstract class Fruit {
    public static <T> double getPrice(Class<T> type) {
        if (type.equals(Apple.class)) {
            return Apple.getPrice();
        }

        return Orange.getPrice();
    }
}
