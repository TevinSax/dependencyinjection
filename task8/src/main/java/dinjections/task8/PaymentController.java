package dinjections.task8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    public static void main(String[] args) {
    }

    public void makePayment() {
        try {
            PaymentService.processPayment();
        } catch (RuntimeException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}
