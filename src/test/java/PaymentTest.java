import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentTest {

    @Test
    void createPaymentTest() {
        String[] products = {"product_A", "product_B"};
        Payment payment = new Payment(2, products);
        String testResult = "product_A product_B ";

        assertEquals(testResult, payment.products.allProducts());
    }
}