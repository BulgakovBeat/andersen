import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment {
    Products products;

    Payment(int amount, String[] products) {
        this.products = new Products(amount, products);
    }

    @Getter
    @Setter
    public static class Products {
        private int amount_Of_Products;
        private String[] products;

        public Products(int amount, String[] products) {
            this.amount_Of_Products = amount;
            this.products = products;
        }

        public String allProducts() {
            StringBuilder allProducts = new StringBuilder();
            for (String product : products)
                allProducts.append(product).append(" ");

            return allProducts.toString();
        }
    }
}
