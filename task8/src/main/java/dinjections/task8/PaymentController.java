package dinjections.task8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class PaymentController {
    @Autowired
    private  PaymentService paymentService;
}
public void makePayment(){
    
}