package dinjections.task8;
import org.springframework.stereotype.Service;
@Service
public class CardPayment implements PaymentService {
    @Override
    public void processPayment()
    {
        throw new RuntimeException("Card declined!");
    }
}


